package com.recicla;

import com.recicla.coleta.*;
import com.recicla.contAcesso.*;
import com.recicla.material.*;
import com.recicla.transporte.*;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class,
        		TestColeta.class,
        		TestLogradouro.class,
        		TestRegiao.class,
        		TestAcesso.class,
        		TestModulo.class,
        		TestPessoa.class,
        		TestUsuario.class,
        		TestHistoricoMaterial.class,
        		TestHistoricoTipoMaterial.class,
        		TestMaterial.class,
        		TestTipoMaterial.class,
        		TestTipoVeiculo.class,
        		TestTransporte.class,
        		TestVeiculo.class   		
);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
