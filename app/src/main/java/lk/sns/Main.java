package lk.sns;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


@SpringBootApplication
public class Main extends Application implements CommandLineRunner {

	private Double xOffset = 0d;
	private Double yOffset = 0d;

	public static void main(String[] args) throws Exception {

		SpringApplication.run(Main.class, args);

	}

	@Override
	public void run(String... arg0) throws Exception {
		launch(arg0);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane p = FXMLLoader.load(getClass().getResource("/IOT-SH-APP_V0.1.fxml"));
		Scene s = new Scene(p);
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		s.setFill(Color.TRANSPARENT);
		primaryStage.setScene(s);
		primaryStage.show();

		xOffset = s.getX();
		yOffset = s.getY();
		p.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				xOffset = event.getSceneX();
				yOffset = event.getSceneY();
			}
		});
		p.setOnMouseDragged(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				double xVal = event.getScreenX() - (xOffset);
				double yVal = event.getScreenY() - (yOffset);
				primaryStage.setX(xVal);
				primaryStage.setY(yVal);

			}
		});
	}

}
