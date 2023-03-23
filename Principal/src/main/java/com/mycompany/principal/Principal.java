

package com.mycompany.principal;

public class Principal {

    public static void main(String[] args) {
        //Instanciação um objeto
        Usuario usuario1 = new Usuario("Bartholomew", "bartholomew@etec.sp.gov.br", "", "");
        //Chamada ao provarExistencia
        usuario1.provarExistencia();
    }
}
