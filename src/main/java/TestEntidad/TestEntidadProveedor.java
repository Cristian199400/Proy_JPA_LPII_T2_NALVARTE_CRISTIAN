package TestEntidad;

import java.util.Date;
import java.util.List;

import DaoImp.ClassProveedorImp;
import model.TblProveedorcl2;

public class TestEntidadProveedor {

	public static void main(String[] args) {
		//realizamos nuestrar respetivas instancias....
		        TblProveedorcl2 tblprod=new TblProveedorcl2();
				ClassProveedorImp crudimp=new ClassProveedorImp();
				//*******************testeando el metodo registrar.....
				//asignamos valores
				/*tblprod.setNomproveecl2("Pedro");
				tblprod.setRucproveecl2("1234567");
				tblprod.setRsocialproveecl2("far s.j");
				tblprod.setEmailproveecl2("farj@");
				// Utilizamos java.sql.Date para la fecha
				Date fecha=new Date(0);
				Date fechasql=new Date(fecha.getTime());
				tblprod.setFeingproveecl2(fechasql);
		        
				//invocamos el metodo registrar...
				crudimp.RegistrarProveedor(tblprod);
				//emitimos mensaje por consola
				System.out.println("Dato registrado correctamente en BD!!!!!!");
				*/
				
				//********************testeando el metodo actualizar.....
				//asigno el codigo a actualizar...
				/*tblprod.setIdproducto(6);
				tblprod.setCantidad(10);
				tblprod.setPrecio(5);
				tblprod.setTotal(tblprod.getCantidad()*tblprod.getPrecio());
				tblprod.setNomprod("fideos");
				tblprod.setNrolote("lote2025");
				tblprod.setCodbarras("cod789456");
				// Utilizamos java.sql.Date para la fecha
				Date fecha=new Date();
				Date fechasql=new Date(fecha.getTime());
				tblprod.setFechaven(fechasql);
		        
				//invocamos el metodo registrar...
				crudimp.ActualizarProducto(tblprod);
				//emitimos mensaje por consola
				System.out.println("Dato actualizado correctamente en BD!!!!!!");
				*/
				
				
				//********************testeando el metodo eliminar.....
				//eliminamos el codigo de numero 5
				/*tblprod.setIdproducto(8);
				//invocamos el metodo eliminar...
				crudimp.EliminarProducto(tblprod);
				//emitimos mensaje por consola
				System.out.println(" Dato eliminado correctamente en BD!!!!!!");
				*/
				
				//********************testeando el metodo buscar.....
				//buscamos el codigo  4
				/*tblprod.setIdproducto(7);
				//invocamos el metodo buscar...
				TblProducto tblproducto=crudimp.BuscarProducto(tblprod);
				//emitimos mensaje por consola
				System.out.println( " Codigo "+tblproducto.getIdproducto()+ 
						" Nombre del Producto "+tblproducto.getNomprod()+
						" Cantidad "+tblproducto.getCantidad()+
						" Precio "+tblproducto.getPrecio() + " Total "+tblproducto.getTotal()+
						" Nro lote "+tblproducto.getNrolote());
				*/
				
				//********************testeando el metodo listar.....
				
				List<TblProveedorcl2> listadoproveedor=crudimp.ListadoProveedor();
				
				for(TblProveedorcl2 prod:listadoproveedor){
			
				//emitimos mensaje por consola
				System.out.println("Codigo "+prod.getIdproveedorcl2()+ " nombre "
				+prod.getNomproveecl2()+" ruc "+prod.getRucproveecl2() +" razonsocial "
						+prod.getRsocialproveecl2()+" email "+prod.getEmailproveecl2()+
						" fecha ingreso del proveedor "+prod.getFeingproveecl2());		
				}//Fin del bucle for ...
				
				
				
		   }// fin del metodo principal..

		} // Fin de la clase...