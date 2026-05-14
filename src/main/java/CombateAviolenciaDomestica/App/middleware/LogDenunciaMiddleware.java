package CombateAviolenciaDomestica.App.middleware;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class LogDenunciaMiddleware implements Filter {
    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        if (req.getRequestURI().contains("/denuncia")) {

            System.out.println("Nova tentativa de denúncia:");
            System.out.println("Rota: " + req.getRequestURI());
            System.out.println("IP: " + req.getRemoteAddr());
        }

        chain.doFilter(request, response);
    }

}