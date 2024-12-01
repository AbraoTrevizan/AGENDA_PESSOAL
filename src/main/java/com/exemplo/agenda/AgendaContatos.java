package com.exemplo.agenda;


import javax.swing.SwingUtilities;

import com.exemplo.agenda.view.ContatoView;
import com.exemplo.agenda.model.ContatoModel;
import com.exemplo.agenda.controller.ContatoController;

public class AgendaContatos {
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {

			ContatoView view = new ContatoView();
			ContatoModel model = new ContatoModel();
			new ContatoController (view, model);

			view.setVisible(true);
		});
	}
}