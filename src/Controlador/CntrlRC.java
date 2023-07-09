package Controlador;

import Modelo.Personas;
import java.sql.ResultSet;

public class CntrlRC {
    public String correo;
    
    public int idPersona;
    public String pregunta;
    public String respuesta;
    
    public String con;
    public String user;
    
    public ResultSet readCorreo()
    {
        Personas MdlRecuContraC =  new Personas();
        return MdlRecuContraC.readCorreo(correo);
    }
    
    public boolean insertPreguntasS()
    {
        Personas MdlinsertPreguntasS =  new Personas();
        return MdlinsertPreguntasS.insertPreguntasS(idPersona, pregunta, respuesta);
    }
    
    public ResultSet readPreguntasS()
    {
        Personas MdlreadPreguntasS =  new Personas();
        return MdlreadPreguntasS.readPreguntas();
    }
    
    public boolean updateContra()
    {
        Personas MdlupdateCon =  new Personas();
        return MdlupdateCon.updateContra(con, user);
    }
}
