package aula20201112.modeloOOMercadoPersistente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import aula20201112.modeloOOMercadoPersistente.pedido.Pedido;
import aula20201112.modeloOOMercadoPersistente.pedido.PedidoService;
import aula20201112.modeloOOMercadoPersistente.pessoa.Fisica;
import aula20201112.modeloOOMercadoPersistente.pessoa.Pessoa;
import aula20201112.modeloOOMercadoPersistente.pessoa.PessoaService;
import aula20201112.modeloOOMercadoPersistente.pessoa.papel.Cliente;
import aula20201112.modeloOOMercadoPersistente.produto.Produto;
import aula20201112.modeloOOMercadoPersistente.produto.ProdutoService;

@SpringBootApplication
public class AppModeloOOMercadoPersistente implements CommandLineRunner {
    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private PessoaService pessoaService;

    @Autowired
    private PedidoService pedidoService;


    public static void main(String[] args) {
        SpringApplication.run(AppModeloOOMercadoPersistente.class, args).close();;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--              produtos              --");
        //produtoService.criarProdutos();
        for (Produto p : produtoService.obterTodos()) {
            System.out.println(p.toString());
        }

        System.out.println("--              pessoas               --");
        //pessoaService.criarPessoas();
        for (Pessoa p : pessoaService.obterTodas()) {
            System.out.println(p.toString());
        }

        //Fisica f = pessoaService.atribuirPapelFisicaPeloCpf("065.578.187-44", new Cliente(10, 5_000.00));
        Fisica f = pessoaService.encontrarPeloCpf("065.578.187-44");
        System.out.println(f.isReitor());
        System.out.println(f.isCliente());


        Pedido pedido01 = new Pedido(1, f);
        Produto p1 = produtoService.findById("f7b13e25-f00f-4795-86d0-8d31969c5e70");
        Produto p2 = produtoService.findById("f105510b-e5f4-4a91-938a-71af86078998");
        pedido01.adicionarItem(p1, 2, 29.90);
        pedido01.adicionarItem(p2, 3, 19.80);
        pedidoService.save(pedido01);

        Pedido recuperado = pedidoService.findById(pedido01.getId());
        System.out.println(recuperado.getValorTotal());
        


    }
    
}
