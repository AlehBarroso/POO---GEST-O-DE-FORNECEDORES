package com.lucas.fornecedores;

public class VerificacaoFornecedor {

    public static void main(String[] args) {
        String nomeFornecedor = "FornecedorD";
        
        boolean fornecedorEncontrado = verificarFornecedor(nomeFornecedor);

        if (!fornecedorEncontrado) {
            System.out.println("Status HTTP 404 (Not Found): Fornecedor não encontrado.");
        } else {
            System.out.println("Fornecedor encontrado.");
        }
    }

    public static boolean verificarFornecedor(String nomeFornecedor) {
        String[] fornecedoresExistentes = {"FornecedorA", "FornecedorB", "FornecedorC"};

        for (String fornecedor : fornecedoresExistentes) {
            if (fornecedor.equals(nomeFornecedor)) {
                return true;
            }
        }

        return false;
    }
}
