package pl.lrozek.jws.client.main;

import static java.util.Arrays.asList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public void start( String[] args ) {
        logger.info( "passing following args : {}", asList( args ) );
    }

    private Logger logger = LoggerFactory.getLogger( getClass() );

}
