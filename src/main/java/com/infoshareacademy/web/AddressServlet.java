package com.infoshareacademy.web;

import com.infoshareacademy.model.Address;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/address")
public class AddressServlet extends HttpServlet {

    private Logger LOG = LoggerFactory.getLogger(AddressServlet.class);

}
