package Maven.block6pathvariableheaders;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MyRestController {
    @PostMapping("/User")
    public Users Registro(@RequestBody Users user) {
        return user;
    }

    @GetMapping("/User/{id}")
    public Long ObtenerID(@PathVariable Long id) {
        return id;
    }

    @PutMapping("/post")
    public HashMap<String, Integer> VaresValores(@RequestParam int var1, int var2) {
        HashMap<String, Integer> out = new HashMap<>();
        out.put("var1", var1);
        out.put("var2", var2);
        return out;
    }

    @GetMapping("/header/")
    public Map<String, String> getHeaders(@RequestHeader Map<String, String> headers) {
        Map<String, String> response = new HashMap<>();
        response.put("h1", headers.get("h1"));
        response.put("h2", headers.get("h2"));
        return response;
    }

    @PostMapping("/all")
    public ResultUser getAllData(@RequestBody(required = false) String body,
                                 @RequestHeader MultiValueMap headers,
                                 @RequestParam Map<String, String> params) {
        ResultUser result = new ResultUser();
        result.setBody(body);
        result.setHeaders(new ArrayList<>(headers.values()));
        result.setRequestParams(new ArrayList<>(params.values()));
        return result;
    }
}