package com.feria.webvirtual.controller;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.feria.webvirtual.bean.LoginVO;
import com.feria.webvirtual.bean.ResponseVO;
import com.feria.webvirtual.dao.Tbl_categoriasRepository;
import com.feria.webvirtual.dao.Tbl_proveedorCrudRepository;
import com.feria.webvirtual.dao.ITbl_proveedorRepository;
import com.feria.webvirtual.dao.entity.Tbl_proveedor;
import com.feria.webvirtual.dao.entity.Tbl_usuarios;
import com.feria.webvirtual.service.IDetalleOrdenService;
import com.feria.webvirtual.service.IOrdenService;
import com.feria.webvirtual.service.ITbl_usuariosService;
import com.feria.webvirtual.service.Tbl_proveedorService;
import com.feria.webvirtual.dao.entity.DetalleOrden;
import com.feria.webvirtual.dao.entity.OrdenCompra;
import com.feria.webvirtual.dao.entity.Tbl_categorias;

@Controller
public class PageController {
	Logger logger = LoggerFactory.getLogger(PageController.class);
	
	
	@Autowired
	private ITbl_proveedorRepository tbl_proveedorRepository;
	
	@Autowired
	private Tbl_proveedorCrudRepository tbl_proveedorCrudRepository;
	
	@Autowired
	private Tbl_categoriasRepository tbl_categoriasRepository;
	
	@Autowired
	private Tbl_proveedorService tbl_proveedorService;
	
	@Autowired
	private ITbl_usuariosService usuarioService;
	
	@Autowired
	private IOrdenService ordenService;
	
	@Autowired
	private IDetalleOrdenService detalleOrdenService;
	
	List<DetalleOrden> detalles = new ArrayList<DetalleOrden>();
	
	OrdenCompra orden = new OrdenCompra();
	
	/**
	 * @author Fainder
	 * INDEX
	 * @param model /
	 * @return cadena login
	 */
	@GetMapping("/")
	public String inicio(Model model) {
		model.addAttribute("loginVO", new LoginVO());
		return "menu";
	}
	
	
	
	@GetMapping("/obtenerLibros")
	public ResponseEntity<ResponseVO>  obtenerLibros( String busqueda) {
		logger.info("obtenerLibros busqueda:"+busqueda);
		ResponseVO responseVO = new ResponseVO();
		
		try {
			
		
		
			
			List<Tbl_proveedor>	listTbl_proveedor = tbl_proveedorRepository.findBytbl_proveedorTitulo(busqueda);
					
				
			
			responseVO.setFlag(true);
			responseVO.setRespuesta(listTbl_proveedor);
			responseVO.setMensaje("Proceso termino con éxito");
		}catch(Exception e) {
			responseVO.setFlag(false);
			responseVO.setMensaje(e.getMessage());
			logger.error("Hubo un error al consultar los libros", e);
		}
	
	  return new ResponseEntity<>(responseVO, HttpStatus.OK); 
  }
	
	
	@GetMapping("/menuLibros")
	public String menuLibros(Model model) {
		
	
	
		
	
		
		model.addAttribute("loginVO", new LoginVO());
		return "menuLibros";
	}
	
	@GetMapping("/menuLibrosSel")
	public String menuLibrosSel(Model model,long id_proveedor) {
		logger.info("menuLibrosSel id_proveedor:"+id_proveedor);
		
		Tbl_proveedor	tbl_proveedor = tbl_proveedorRepository.findByIDtbl_proveedorTitulo(id_proveedor);
		
		model.addAttribute("tbl_proveedor", tbl_proveedor);
		return "menuLibrosSel";
	}
	
	@PostMapping("/validUer")
	public ResponseEntity<ResponseVO> validUer(Model model,String identificador) {
		logger.info("validUer identificador:"+identificador);
		
		ResponseVO responseVO = new ResponseVO();
		
    try {

    	Tbl_usuarios	tbl_usuarios = tbl_proveedorRepository.findByIDtbl_usuarios(identificador);
		
    	if(tbl_usuarios==null) {
    		responseVO.setFlag(true);
			responseVO.setRespuesta(null);
			responseVO.setMensaje("Proceso termino con éxito");
    		return new ResponseEntity<>(responseVO, HttpStatus.OK); 
    	}
		    	if(tbl_usuarios!=null && tbl_usuarios.getPassword()== null) {
		    		logger.info("password is null");
		    	}else {
		    		logger.info("password exits");
		    		
		    	}
					
					responseVO.setFlag(true);
					responseVO.setRespuesta(tbl_usuarios);
					responseVO.setMensaje("Proceso termino con éxito");
		}catch(Exception e) {
			responseVO.setFlag(false);
			responseVO.setMensaje(e.getMessage());
			logger.error("Hubo un error al validar el usuario:"+identificador, e);
		}
		return new ResponseEntity<>(responseVO, HttpStatus.OK); 
	}
	
	@PostMapping("/updatePass")
	public ResponseEntity<ResponseVO> updatePass(Model model,String username,String pass) {
logger.info("validUer username:"+username+"\n"+"pass:"+pass);
		
		ResponseVO responseVO = new ResponseVO();
		
    try {

    	int res=	 tbl_proveedorCrudRepository.updatePassByUsername(username,pass);
		
    	if(res==1) {
    		responseVO.setFlag(true);
			responseVO.setRespuesta(1);
			responseVO.setMensaje("Proceso termino con éxito");
    		
    	}else {
    		
    		responseVO.setFlag(true);
			responseVO.setRespuesta(null);
			responseVO.setMensaje("Hubo un error al actualizar el usuario");
    	}
					
					
		}catch(Exception e) {
			responseVO.setFlag(false);
			responseVO.setMensaje(e.getMessage());
			logger.error("Hubo un error al actualizar el usuario:"+username, e);
		}
		return new ResponseEntity<>(responseVO, HttpStatus.OK); 
		
	
	}
	
	
	@PostMapping("/entrarSistema")
	public ResponseEntity<ResponseVO> entrarSistema(Model model,String username,String pass) {
logger.info("validUer username:"+username+"\n"+"pass:"+pass);
		
		ResponseVO responseVO = new ResponseVO();
		
    try {

    	Tbl_usuarios	tbl_usuarios = tbl_proveedorRepository.findByIDtbl_usuarios(username);
		
    	if(tbl_usuarios==null) {
    		responseVO.setFlag(true);
			responseVO.setRespuesta(null);
			responseVO.setMensaje("Proceso termino con éxito");
    		return new ResponseEntity<>(responseVO, HttpStatus.OK); 
    	}
		    	if(tbl_usuarios!=null && tbl_usuarios.getPassword()== null) {
		    		logger.info("password is null");
		    	}else {
		    		logger.info("password exits");
		    		
		    	}
					
					responseVO.setFlag(true);
					responseVO.setRespuesta(tbl_usuarios);
					responseVO.setMensaje("Proceso termino con éxito");
		}catch(Exception e) {
			responseVO.setFlag(false);
			responseVO.setMensaje(e.getMessage());
			logger.error("Hubo un error al validar el usuario:"+username, e);
		}
		return new ResponseEntity<>(responseVO, HttpStatus.OK); 
		
	
	}
	
	@GetMapping("/getCategories")
	public ResponseEntity<ResponseVO> getCategories(Model model,Integer id_tema) {
logger.info("getCategories id_tema:"+id_tema+"\n");
		
		ResponseVO responseVO = new ResponseVO();
		
    try {

    	List<Tbl_categorias> listTbl_categorias= tbl_categoriasRepository.findBytbl_categorias(id_tema);
		
    	if(listTbl_categorias==null) {
    		responseVO.setFlag(true);
			responseVO.setRespuesta(null);
			responseVO.setMensaje("Proceso termino con éxito");
    		return new ResponseEntity<>(responseVO, HttpStatus.OK); 
    	}
		    	
					
					responseVO.setFlag(true);
					responseVO.setRespuesta(listTbl_categorias);
					responseVO.setMensaje("Proceso termino con éxito");
		}catch(Exception e) {
			responseVO.setFlag(false);
			responseVO.setMensaje(e.getMessage());
			logger.error("Hubo un error al validar getCategories id:"+id_tema, e);
		}
		return new ResponseEntity<>(responseVO, HttpStatus.OK); 
		
	
	}
	
	@PostMapping("/cart")
	public String addCart(@RequestParam long id_proveedor, Model model) {
		DetalleOrden detalleOrden = new DetalleOrden();
		Tbl_proveedor tbl_proveedor = new Tbl_proveedor();
		double sumaTotal=0;
		
		Optional<Tbl_proveedor> optionalTbl_proveedor = tbl_proveedorService.get(id_proveedor);
		logger.info("Libro agregado: {}",optionalTbl_proveedor.get());
		
		tbl_proveedor=optionalTbl_proveedor.get();
		
		detalleOrden.setCantidad(1);
		detalleOrden.setPrecio(tbl_proveedor.getPrecio_dolares());
		detalleOrden.setNombre(tbl_proveedor.getTitulo());
		detalleOrden.setTotal(tbl_proveedor.getPrecio_dolares());
		detalleOrden.setProveedor(tbl_proveedor);
		
		long idProveedor = tbl_proveedor.getId_proveedor();
		boolean agr = detalles.stream().anyMatch(l -> l.getProveedor().getId_proveedor()==idProveedor);
		
		if(!agr) {
			detalles.add(detalleOrden);
		}
		
		sumaTotal = detalles.stream().mapToDouble(dt->dt.getTotal()).sum();
		
		orden.setTotal(sumaTotal);
		model.addAttribute("cart",detalles);
		model.addAttribute("orden",orden);
		
		return "carrito";
	}
	
	@GetMapping("/delete/cart/{id_proveedor}")
	public String deleteLibroCart(@PathVariable long id_proveedor, Model model) {
		
		List<DetalleOrden> ordenesNueva = new ArrayList<DetalleOrden>();
		
		for (DetalleOrden detalleOrden: detalles) {
			if(detalleOrden.getProveedor().getId_proveedor()!=id_proveedor) {
				ordenesNueva.add(detalleOrden);
			}
		}
		
		detalles=ordenesNueva;
		double sumaTotal = 0;
		
		sumaTotal = detalles.stream().mapToDouble(dt->dt.getTotal()).sum();
		
		orden.setTotal(sumaTotal);
		model.addAttribute("cart",detalles);
		model.addAttribute("orden",orden);
		
		return "carrito";
	}
	
	@GetMapping("/getCart")
	public String getCart(Model model) {
		model.addAttribute("cart",detalles);
		model.addAttribute("orden",orden);
		return "/carrito";
	}
	
	@GetMapping("/order")
	public String order(Model model) {
		
		Tbl_usuarios usuario = usuarioService.findById(1).get();
		
		model.addAttribute("cart",detalles);
		model.addAttribute("orden",orden);
		model.addAttribute("usuario",usuario);
		
		return ("/resumenorden");
	}
	
	@GetMapping("/saveOrder")
	public String saveOrder() {
		
		Date fechaCreacion = new Date();
		orden.setFechacompra(fechaCreacion);
		orden.setNumero(ordenService.generarNumeroOrden());
		
		Tbl_usuarios usuario = usuarioService.findById(1).get();
		orden.setUsuario(usuario);
		orden.setNombresolicitante(usuario.getNombre());
		orden.setInformacionsolicitante(usuario.getDireccion());
		orden.setAdscripcion(usuario.getDepartamento());
		
		ordenService.save(orden);
		
		for (DetalleOrden dt:detalles) {
			dt.setOrden(orden);
			dt.setClave_proveedor(dt.getProveedor().getClave_proveedor());
			dt.setInfoproveedor(dt.getProveedor().getEditorial());
			dt.setInfolibro(dt.getProveedor().getUrl());
			dt.setAutor(dt.getProveedor().getAutor());
			dt.setTitulo(dt.getProveedor().getTitulo());
			dt.setAnio(dt.getProveedor().getAnio());
			dt.setIsbn(dt.getProveedor().getIsbn());
			if((dt.getProveedor().getTipo_fto_electronico() != 0)) {
				dt.setFormato("Electronico");
			} else {
				dt.setFormato("Fisico");
			}
			
			detalleOrdenService.save(dt);
		}
		
		
		
		orden = new OrdenCompra();
		detalles.clear();
		
		return "redirect:/";
	}

}
