package br.ce.edu.todolist.command;

import javax.servlet.http.HttpServletRequest;

public interface Command {
	
	public String execute(HttpServletRequest request);

}