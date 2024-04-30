package Maven.block6pathvariableheaders;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
@RestController
public class RestControllerall {
    @RequestMapping(value = "/**")
    public ResponseEntity<String> requestType(HttpServletRequest request) throws IOException {

        // Obtiene la información de la solicitud HTTP
        String body ="";
        if (request.getInputStream()!=null) {
            byte[] datos = request.getInputStream().readAllBytes();

             body = new String(datos);
            System.out.println("Body: " + body);
        }
        String method = "Método: " + request.getMethod();
        String path = "Ruta: " + request.getRequestURI();
        String headers = "Cabeceras:\n" + extractHeaders(request);
        String variables = "Variables:\n" + extractVariables(request);


        // Construye el mensaje de respuesta
        String responseMessage = method + "\n" + path + "\n" + headers + "\n" + variables + "\n Body: " +body;

        // Devuelve la respuesta
        return new ResponseEntity<>(responseMessage, HttpStatus.OK);
    }

    // Método para extraer las cabeceras de la solicitud
    private String extractHeaders(HttpServletRequest request) {
        StringBuilder headers = new StringBuilder();

        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            headers.append(headerName).append(": ").append(headerValue).append("\n");
        }
        return headers.toString();
    }

    // Método para extraer las variables de la solicitud (query parameters)
    private String extractVariables(HttpServletRequest request) {
        StringBuilder variables = new StringBuilder();
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String paramName = parameterNames.nextElement();
            String paramValue = request.getParameter(paramName);
            variables.append(paramName).append(": ").append(paramValue).append("\n");
        }
        return variables.toString();
    }}

