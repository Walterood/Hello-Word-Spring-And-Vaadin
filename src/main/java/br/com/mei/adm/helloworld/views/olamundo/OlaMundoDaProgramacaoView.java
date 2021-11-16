package br.com.mei.adm.helloworld.views.olamundo;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import br.com.mei.adm.helloworld.views.MainLayout;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Olá Mundo com Spring e Vaadin!!!")
@Route(value = "ola-mundo-da-programacao", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class OlaMundoDaProgramacaoView extends HorizontalLayout {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TextField nomeUsuario;
    private Button acionarSaudacao;

    public OlaMundoDaProgramacaoView() {
        setMargin(true);
        nomeUsuario = new TextField("Escreva seu nome:");
        acionarSaudacao = new Button("Acionar saudação");
        add(nomeUsuario, acionarSaudacao);
        setVerticalComponentAlignment(Alignment.END, nomeUsuario, acionarSaudacao);
        acionarSaudacao.addClickListener(e -> {
            Notification.show("Olá " + nomeUsuario.getValue());
        });
    }

}
