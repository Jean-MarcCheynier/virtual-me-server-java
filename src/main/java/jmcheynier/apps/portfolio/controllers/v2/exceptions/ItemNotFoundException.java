package jmcheynier.apps.portfolio.controllers.v2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "no language found")
public class ItemNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
}
