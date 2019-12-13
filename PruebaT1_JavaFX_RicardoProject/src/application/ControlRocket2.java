package application;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlRocket2 {
	
	@FXML
	private Pane Pane1;
	@FXML
	private Pane Pane2;
	@FXML
	private Pane Pane3;
	@FXML
	private Pane Pane4;
	@FXML
	private AnchorPane root2;
	
	public void initialize() {
		backgroundAnimation();
	}
	
	//Metodo para cerrar la aplicacion.
		@FXML
		public void closeApp() {
			Stage thisStage = (Stage) root2.getScene().getWindow();
			thisStage.close();
		}
	
	//Método para crear una transición de imagenes comprendidas desde Pane1 a Pane4.
	private void backgroundAnimation() {

		FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2),
				Pane4);
		fadeTransition.setFromValue(1);
		fadeTransition.setToValue(0);
		fadeTransition.play();

		fadeTransition
				.setOnFinished(event -> {

					FadeTransition fadeTransition1 = new FadeTransition(
							Duration.seconds(3), Pane3);
					fadeTransition1.setFromValue(1);
					fadeTransition1.setToValue(0);
					fadeTransition1.play();

					fadeTransition1.setOnFinished(event1 -> {
						FadeTransition fadeTransition2 = new FadeTransition(
								Duration.seconds(3), Pane2);
						fadeTransition2.setFromValue(1);
						fadeTransition2.setToValue(0);
						fadeTransition2.play();

						fadeTransition2.setOnFinished(event2 -> {

							FadeTransition fadeTransition0 = new FadeTransition(
									Duration.seconds(3), Pane2);
							fadeTransition0.setFromValue(0);
							fadeTransition0.setToValue(1);
							fadeTransition0.play();

							fadeTransition0.setOnFinished(event3 -> {

								FadeTransition fadeTransition11 = new FadeTransition(
										Duration.seconds(3), Pane3);

								fadeTransition11.setFromValue(0);
								fadeTransition11.setToValue(1);
								fadeTransition11.play();

								fadeTransition11.setOnFinished(event4 -> {

									FadeTransition fadeTransition22 = new FadeTransition(
											Duration.seconds(3), Pane4);

									fadeTransition22.setFromValue(0);
									fadeTransition22.setToValue(1);
									fadeTransition22.play();

									fadeTransition22.setOnFinished(event5 -> {

										backgroundAnimation();
									});

								});

							});

						});
						
					});

				});

	}

}
