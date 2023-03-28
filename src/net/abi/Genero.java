package net.abi;

public class Genero {
    private String genero;
    int accion=0;
    int aventura=0;
    int comedia=0;
    int drama=0;
    int horror=0;
    int documental=0;

    public Genero() {
    }

    public Genero(String genero) {
        this.genero = genero;
        if(genero=="Accion"){
            accion++;
        }
        if(genero=="Aventura"){
            aventura++;
        }
        if(genero=="Comedia"){
            comedia++;
        }
        if(genero=="Drama"){
            drama++;
        }
        if(genero=="Horror"){
            horror++;
        }
        if(genero=="Documental"){
            documental++;
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "Genero: " +genero+". ";
    }
}
