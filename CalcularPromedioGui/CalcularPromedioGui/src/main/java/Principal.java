import controlador.coordinador;
import vista.gui.VentanaOperaciones;
import vista.gui.*;
import modelo.vo.*;
import modelo.operaciones.*;
import controlador.*;

public class Principal {
    private VentanaConsulta miVentanaConsulta;
    private VentanaConsultaGeneral miVentanaConsultaGeneral;
    private VentanaConsultaPersonas miVentanaConsultaPersonas;
    private VentanaOperaciones miVentanaPrincipal;
    private ModeloDatos miModeloDatos;
    private coordinador micoordinador;
    private Procesos misProcesos;
    
    public static void main(String[] args) {
        Principal miPrincipal=new Principal();
        miPrincipal.iniciar();
    }
    
    public void iniciar() {
        miVentanaConsulta = new VentanaConsulta();
        miVentanaConsultaGeneral = new VentanaConsultaGeneral();
        miVentanaConsultaPersonas = new VentanaConsultaPersonas();
        miVentanaPrincipal = new VentanaOperaciones();
        miModeloDatos = new ModeloDatos();
        micoordinador = new coordinador();
        misProcesos = new Procesos();
        
        miVentanaConsulta.setProcesos(misProcesos);
        miVentanaConsultaGeneral.setProcesos(misProcesos);
        miVentanaConsultaPersonas.setProcesos(misProcesos);
        miVentanaPrincipal.setProcesos(misProcesos);
        
        miVentanaConsulta.setcoordinador(micoordinador);
        miVentanaConsultaGeneral.setcoordinador(micoordinador);
        miVentanaConsultaPersonas.setcoordinador(micoordinador);
        miVentanaPrincipal.setcoordinador(micoordinador);
        
        misProcesos.setModeloDatos(miModeloDatos);
        
        micoordinador.setModeloDados(miModeloDatos);
        micoordinador.setVentanaConsulta(miVentanaConsulta);
        micoordinador.setVentanaConsultaGeneral(miVentanaConsultaGeneral);
        micoordinador.setVentanaConsultaPersonas(miVentanaConsultaPersonas);
        micoordinador.setVentanaPrincipal(miVentanaPrincipal);
        micoordinador.mostarVentanaPrincipal();
    }
}
    
  