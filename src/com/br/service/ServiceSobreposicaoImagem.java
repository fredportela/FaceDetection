package com.br.service;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.List;

import com.br.model.PropriedadesFace;

public class ServiceSobreposicaoImagem {
	
	public BufferedImage juntarImagens(List<PropriedadesFace> dados, BufferedImage imagemPrincipal){
		
		for(PropriedadesFace dado: dados){
			imagemPrincipal = juntarUmaImage(imagemPrincipal, dado.getImageCortada(),dado.getX(),dado.getY());
		}
		
		return imagemPrincipal;
		
	}
	
	public static BufferedImage juntarUmaImage(BufferedImage imagemPrincipal,
            BufferedImage imagemCortada, int x, int y) {
 
        Graphics2D g = imagemPrincipal.createGraphics();
        
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        
        g.drawImage(imagemPrincipal, 0,0, null);
 
        g.drawImage(imagemCortada, x, y, null);
 
        g.dispose();
        return imagemPrincipal;
    }
	
}
