package br.unitins.topicos1.service;

import br.unitins.topicos1.dto.pedido.PedidoDTO;
import br.unitins.topicos1.dto.pedido.PedidoResponseDTO;

import jakarta.validation.Valid;

import java.util.List;

public interface PedidoService {

    PedidoResponseDTO insert(@Valid PedidoDTO dto);

    PedidoResponseDTO update(PedidoDTO dto, Long id);

    void delete(Long id);

    PedidoResponseDTO findById(Long id);

    List<PedidoResponseDTO> findByAll();


}
