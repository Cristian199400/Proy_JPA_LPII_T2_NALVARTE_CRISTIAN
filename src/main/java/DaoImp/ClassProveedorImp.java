package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProveedor;
import model.TblProveedorcl2;

public class ClassProveedorImp implements IProveedor {

	@Override
	public void RegistrarProveedor(TblProveedorcl2 tblproveedorcl2) {
		//nos conectamos con la unidad de persistencia...
				//para poder registrar datos en la base de datos...
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("Proy_JPA_LPII_T2_NALVARTE_CRISTIAN");
				EntityManager em=emf.createEntityManager();
				try{
					//iniciamos las transaccion...
					em.getTransaction().begin();
					//invocamos el metodo registrar...
					//esto seria en jdbc insert into tbl_producto values........
					//en jpa es persist...
					em.persist(tblproveedorcl2);
					//confirmamos
					em.getTransaction().commit();
				}catch(RuntimeException e){
					e.getMessage();
				}finally{
					//cerramos
					em.close();
				}//fin del finally.

		} // Fin del metodo registrar producto
	@Override
	public void ActualizarProveedor(TblProveedorcl2 tblproveedorcl2) {
		//nos conectamos con la unidad de persistencia...
		//para poder actualizar lis registros...
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Proy_JPA_LPII_T2_NALVARTE_CRISTIAN");
		EntityManager em=emf.createEntityManager();
		try{
			//iniciamos las transaccion...
			em.getTransaction().begin();
			//invocamos el metodo actualizar...
			//esto seria en jdbc insert into tbl_producto values........
			//en jpa es persist...
			em.merge(tblproveedorcl2);
			//confirmamos
			em.getTransaction().commit();
		}catch(RuntimeException e){
			e.getMessage();
		}finally{
			//cerramos
			em.close();
		}//fin del finally.
	} // Fin del metodo actualizar producto


	@Override
	public void EliminarProveedor(TblProveedorcl2 tblproveedorcl2) {
		//nos conectamos con la unidad de persistencia...
				//para poder actualizar lis registros...
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("Proy_JPA_LPII_T2_NALVARTE_CRISTIAN");
				EntityManager em=emf.createEntityManager();
				try{
					//iniciamos las transaccion...
					em.getTransaction().begin();
					//recuperamos el codigo a eliminar
					TblProveedorcl2 tblproelim=em.find(TblProveedorcl2.class,tblproveedorcl2.getIdproveedorcl2());
					//aplicamos una condicion...
					if (tblproveedorcl2!=null){
						//eliminamos el codigo...
						em.remove(tblproelim);
						//confirmamos
						em.getTransaction().commit();
					}//fin de la condicion
				}catch(RuntimeException e){
					if(em.getTransaction().isActive()) em.getTransaction().rollback();
					e.getMessage();
				}finally{
					//cerramos
					em.close();
				}//fin del finally.
		} // Fin del metodo eliminar producto

	@Override
	public TblProveedorcl2 BuscarProveedor(TblProveedorcl2 tblproveedorcl2) {
		//nos conectamos con la unidad de persistencia...
		//para realizar la respectiva busqueda...
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Proy_JPA_LPII_T2_NALVARTE_CRISTIAN");
		EntityManager em=emf.createEntityManager();
		//hacemos la respectiva instancia...
		TblProveedorcl2 bustblprod=null;
		try{
			//iniciamos las transaccion...
			em.getTransaction().begin();
			//buscamos el respectivo codigo
			bustblprod=em.find(TblProveedorcl2.class,tblproveedorcl2.getIdproveedorcl2());
			//confirmamos
			em.getTransaction().commit();
		}catch(RuntimeException e){
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			//emitimos un mensaje
			e.getMessage();
		}finally{
			//cerramos
			em.close();
		}//fin del finally.
		return bustblprod;
	} // Fin del metodo buscar producto

	@Override
	public List<TblProveedorcl2> ListadoProveedor() {
		//nos conectamos con la unidad de persistencia...
				//para realizar el listado del producto..
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("Proy_JPA_LPII_T2_NALVARTE_CRISTIAN");
				EntityManager em=emf.createEntityManager();
				List<TblProveedorcl2> Listado=null;
				try{
					//iniciamos las transaccion...
					em.getTransaction().begin();
					//Aplicamos consulta JPQL
					Listado = em.createQuery("Select c from TblProveedorcl2 c",TblProveedorcl2.class).getResultList();
					//confirmamos
					em.getTransaction().commit();
					
				}catch(RuntimeException e){
					//aplicamos una condicion
					if(em.getTransaction().isActive()) em.getTransaction().rollback();
					//emitimos un mensaje
					e.getMessage();
				}finally{
					//cerramos
					em.close();
				}//fin del finally.
				//retornamos el listado...
				return Listado;
		  } // Fin del metodo listado productos

		}  //Fin de la clase....
	
