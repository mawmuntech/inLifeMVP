package com.app.medite.inlife.beans;

public class Album {

    String[] dias;
    String[] url;

    public Album(String[] d,String[] u){
        dias = d;
        url = u;
    }

    public String getDias(int a) {
        return dias[a];
    }

    public int getDiasLenght(){
        return  dias.length;
    }

    public String getUrl(int a){
        return url[a];
    };

}
