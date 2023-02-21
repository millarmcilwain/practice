package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
		
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Group root = new Group();
		Scene scene = new Scene(root,600,600, Color.CRIMSON);
		Stage stage = new Stage();
		
		Text text = new Text();
		text.setText("text");
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font("Verdana", 30));
		text.setFill(Color.LIME);
		
		Line line = new Line();
		line.setStartX(200);
		line.setStartY(200);
		line.setEndX(500);
		line.setEndY(200);
		line.setStrokeWidth(5);
		line.setStroke(Color.YELLOW);
		line.setOpacity(0.8);
		line.setRotate(45);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setX(100);
		rectangle.setY(100);
		rectangle.setWidth(100);
		rectangle.setHeight(100);
		rectangle.setFill(Color.BLUE);
		rectangle.setStrokeWidth(5);
		rectangle.setStroke(Color.BLACK);
		
		Polygon triangle = new Polygon();
		triangle.getPoints().setAll(
				200.0,200.0, 
				300.0, 300.0,
				200.0, 300.0);
		triangle.setFill(Color.YELLOW);
		
		Circle circle = new Circle();
		circle.setCenterX(350);
		circle.setCenterY(350);
		circle.setRadius(50);
		circle.setFill(Color.ORANGE);
		
		Image explore = new Image("globe.png");
		ImageView imageView = new ImageView(explore);
		imageView.setX(400);
		imageView.setX(400);
		
		
		
		root.getChildren().add(text);
		root.getChildren().add(line);
		root.getChildren().add(rectangle);
		root.getChildren().add(triangle);
		root.getChildren().add(circle);
		root.getChildren().add(imageView);
	
		
	
		Image icon = new Image("globe.png");
		primaryStage.getIcons().add(icon);
		
		
		primaryStage.setTitle("Java FX Test");
	
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
