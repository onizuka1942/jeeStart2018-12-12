package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "second",urlPatterns = {"/second","*.do"})
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //recuperer le valeur du parametre nom de la requete
        String nom = req.getParameter("nom");
        //l'objet out c'est la reponse qu'on va retourner on le creer de response
        PrintWriter out = resp.getWriter();
        //afficher
        out.println("<html><body><h3>"+nom+"</h3> protocole"+req.getProtocol()+" adresse"+req.getRemoteAddr()+"</body></html>");

    }

}
