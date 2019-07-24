package com.company;

public class Box  {
    private int batch;

    public Box(int batch){

        this.batch = batch;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Box){
            Box box = (Box) obj;
            return batch == box.batch;
        }
        return false;
    }

}