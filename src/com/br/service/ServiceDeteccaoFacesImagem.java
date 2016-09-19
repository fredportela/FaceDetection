package com.br.service;

import java.util.ArrayList;
import java.util.List;

import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Rect;
import org.opencv.objdetect.CascadeClassifier;

import com.br.model.PropriedadesFace;
import java.awt.Graphics;

/***
 * 
 * @author Rafael Guinho
 *
 */
public class ServiceDeteccaoFacesImagem {
	
	/***
	 * 
	 * @param cascadeClassifier
	 * @param mat
	 * @return
	 */
	public MatOfRect detectarFaces(CascadeClassifier cascadeClassifier, Mat mat){
		
		MatOfRect matOfRect = new MatOfRect();
		cascadeClassifier.detectMultiScale(mat, matOfRect);
		
		return matOfRect;
	}
	
	/***
	 * 
	 * @param matOfRect
	 * @return
	 */
	public List<PropriedadesFace> obterDadosFaces(MatOfRect matOfRect){
		
		List<PropriedadesFace> dados = new ArrayList<PropriedadesFace>();
		
		for (Rect rect : matOfRect.toArray()) {
			
			PropriedadesFace prop = new PropriedadesFace();
			prop.setX(rect.x);
			prop.setY(rect.y);
			prop.setHeight(rect.height);
			prop.setWidth(rect.width);
			
			dados.add(prop);

		}
		
		return dados;
	}
        
    public List<PropriedadesFace> obterDadosFaces(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
