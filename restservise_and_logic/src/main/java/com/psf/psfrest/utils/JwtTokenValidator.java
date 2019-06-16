package com.psf.psfrest.utils;

import com.psf.psfrest.model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenValidator {

    @Value("${jwt.secret}")
    private String secret;

    /**
     * Tries to parse specified String as a JWT token. If successful, returns User object with username, id and role prefilled (extracted from token).
     * If unsuccessful (token is invalid or not containing all required user properties), simply returns null.
     *
     * @param token the JWT token to parse
     * @return the User object extracted from specified token or null if a token is invalid.
     */
    public JwtUser parseToken(String token) {
        JwtUser user = null;
        try {

            Claims body = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws("Bearer "+token)
                    .getBody();

            user = new JwtUser();
            user.setUsername(body.getSubject());
            user.setId(Long.parseLong((String) body.get("userId")));
            user.setRole((String) body.get("role"));

        } catch (JwtException e) {
            // Simply print the exception and null will be returned for the userDto
            e.printStackTrace();
        }
        return user;
    }
}