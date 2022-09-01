package listeners;

import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;
import java.util.HashMap;

public class SessionListener implements HttpSessionListener {

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        HashMap sessionMap = (HashMap) session.getServletContext().getAttribute("sessionMap");
        sessionMap.remove(session.getId(), session);        
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        HashMap sessionMap = (HashMap) session.getServletContext().getAttribute("sessionMap");
        sessionMap.put(session.getId(), session);
    } 
}