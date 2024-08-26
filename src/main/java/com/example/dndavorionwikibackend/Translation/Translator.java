package com.example.dndavorionwikibackend.Translation;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class Translator<T,V> {

    private final ModelMapper modelMapper;

    public Translator() {
        this.modelMapper = new ModelMapper();
    }

    public T classToClassDTO (V objectToTranslate, Class<T> clazz){
        return modelMapper.map(objectToTranslate, clazz);
    }

    public V classDTOToClass (T objectToTranslate, Class<V> clazz){
        return modelMapper.map(objectToTranslate,clazz);
    }
}
