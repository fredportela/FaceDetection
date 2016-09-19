package com.br.service;

import java.awt.image.BufferedImage;
import java.util.List;

import com.br.model.PropriedadesFace;

public class ServiceCorteImagem {

	public List<PropriedadesFace> CortarImagem(List<PropriedadesFace> dados, BufferedImage imagem){
		
		for(PropriedadesFace dado : dados){
			dado.setImageCortada(imagem.getSubimage(dado.getX(), dado.getY(), dado.getWidth(), dado.getHeight()));
		}
		
		return dados;
	}
        
        public BufferedImage CortarImagemOriginal(PropriedadesFace dado, BufferedImage imagem){
            BufferedImage im = imagem.getSubimage(dado.getX(), dado.getY(), dado.getWidth(), dado.getHeight());
            
            return im;
        }
}
    
