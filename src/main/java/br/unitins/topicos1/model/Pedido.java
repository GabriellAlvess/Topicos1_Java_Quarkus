package br.unitins.topicos1.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Pedido extends DefaultEntity {

    @Column(name = "codigo_boleto")
    private String codigoBoleto;

    @Column(name = "data_vencimento_boleto")
    private LocalDate dataVencimentoBoleto;
    
    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;

    @Column(name = "id_jogo", nullable = false)
    private Long idJogo;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinTable(name = "pedido_endereco", joinColumns = @JoinColumn(name = "id_pedido"), inverseJoinColumns = @JoinColumn(name = "id_endereco"))
    private List<Endereco> listaEndereco;

    @Column(nullable = false)
    private LocalDate dataCompra;

    // @Enumerated(EnumType.STRING)
    // @Column(nullable = false)
    // private FormaPagamento formaPagamento;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, nullable = false)
    private StatusPedido statusPedido;

    

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(Long idJogoLong) {
        this.idJogo = idJogo;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    // public FormaPagamento getFormaPagamento() {
    //     return formaPagamento;
    // }

    // public void setFormaPagamento(FormaPagamento formaPagamento) {
    //     this.formaPagamento = formaPagamento;
    // }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public List<Endereco> getListaEndereco() {
        return listaEndereco;
    }

    public void setListaEndereco(List<Endereco> listaEndereco) {
        this.listaEndereco = listaEndereco;
    }

    public String getCodigoBoleto() {
        return codigoBoleto;
    }

    public void setCodigoBoleto(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    public LocalDate getDataVencimentoBoleto() {
        return dataVencimentoBoleto;
    }

    public void setDataVencimentoBoleto(LocalDate dataVencimentoBoleto) {
        this.dataVencimentoBoleto = dataVencimentoBoleto;
    }

    
    
}
