package br.com.alura.screenmatch1.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
