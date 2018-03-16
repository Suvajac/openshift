package net.etfbl.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.etfbl.baza.KorisnikDAO;
import net.etfbl.baza.SastanakDAO;
import net.etfbl.beans.KorisnikBean;
import net.etfbl.model.Korisnik;
import net.etfbl.model.Sastanak;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		KorisnikBean korisnikBean = (KorisnikBean) session.getAttribute("korisnikBean");
		if(korisnikBean==null)
			korisnikBean = new KorisnikBean();
		String option = request.getParameter("option");
		String address = "";
		RequestDispatcher rd = null;
		if(option==null)
			address = "/WEB-INF/pocetna.jsp";
		else {
			if("login".equals(option)) {
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				
				Korisnik k = KorisnikDAO.login(username, password);
				if(k!=null) {
					korisnikBean.setKorisnik(k);
					korisnikBean.setLogged(true);
					session.setAttribute("korisnikBean", korisnikBean);
					address = "/WEB-INF/pregled.jsp";
					rd = request.getRequestDispatcher("/WEB-INF/header.jsp");
					rd.include(request, response);
				}
				else {
					address = "/WEB-INF/pocetna.jsp";
				}
			}
			else if("dodajSastanak".equals(option)) {
				String naziv = request.getParameter("naziv");
				String mjesto = request.getParameter("mjesto");
				String vrijeme = request.getParameter("vrijeme");
				String status = request.getParameter("status");
				double vrijemeTrajanja = Double.parseDouble(request.getParameter("vrijemeTrajanja"));
				Sastanak s = new Sastanak(naziv, mjesto, vrijeme, vrijemeTrajanja, korisnikBean.getKorisnik(), status);
				SastanakDAO.dodaj(s);
				
				rd = request.getRequestDispatcher("/WEB-INF/header.jsp");
				rd.include(request, response);
				address = "/WEB-INF/pregled.jsp";
			}
			else if("pregled".equals(option)) {
				rd = request.getRequestDispatcher("/WEB-INF/header.jsp");
				rd.include(request, response);
				address = "/WEB-INF/pregled.jsp";
			}
			else if("dodaj".equals(option)) {
				rd = request.getRequestDispatcher("/WEB-INF/header.jsp");
				rd.include(request, response);
				address = "/WEB-INF/dodaj.jsp";
			}
			else if("ostali".equals(option)) {
				rd = request.getRequestDispatcher("/WEB-INF/header.jsp");
				rd.include(request, response);
				address = "/WEB-INF/ostali.jsp";
			}
			else if("logout".equals(option)) {
				session.invalidate();
				address = "/WEB-INF/pocetna.jsp";
			}
		}
		
		rd = request.getRequestDispatcher(address);
		rd.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
