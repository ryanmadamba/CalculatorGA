import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;
import java.lang.Math;

public class calculator extends Application{
	
	Label answer;
	Button add;
	Button sub;
	Button mult;
	Button div;
	Button one;
	Button two;
	Button three;
	Button four;
	Button five;
	Button six;
	Button seven;
	Button eight;
	Button nine;
	Button zero;
	Button equal;
	Button clear;
	Button decimal;
	Button log;
	
	int flag = 0;
	String preop = "";
	String postop = "";
	String operator;
	double ans = 0;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception{
		stage.setTitle("Calculator"); //title of window
		answer = new Label("");
		
		VBox root = new VBox(); //main scene
		
		Scene scene = new Scene(root, 200, 200);
		
		stage.setScene(scene);
		
		//buttons
		GridPane buttons = new GridPane();
		
		log = new Button("log10");
		log.setOnAction(new EventHandler<ActionEvent>() { //sets what button does
			
			public void handle(ActionEvent event) {
				answer.setText("log base 10");
				operator = "log";
				flag = 1;
			}
		});
		
		clear = new Button("Clear");
		clear.setOnAction(new EventHandler<ActionEvent>() { //sets what button does
			
			public void handle(ActionEvent event) {
				preop = "";
				postop = "";
				
				flag = 0;
				answer.setText("");
			}
		});
		
		add = new Button("+");
		add.setOnAction(new EventHandler<ActionEvent>() { //sets what button does
			
			public void handle(ActionEvent event) {
				answer.setText("+");
				operator = "+";
				flag = 1;
			}
		});
		
		//operators
		sub = new Button("-");
		sub.setOnAction(new EventHandler<ActionEvent>() { //sets what button does
			
			public void handle(ActionEvent event) {
				answer.setText("-");
				operator = "-";
				flag = 1;
			}
		});

		mult = new Button("*");
		mult.setOnAction(new EventHandler<ActionEvent>() { //sets what button does
			
			public void handle(ActionEvent event) {
				answer.setText("*");
				operator = "*";
				flag = 1;
			}
		});
		
		div = new Button("/");
		div.setOnAction(new EventHandler<ActionEvent>() { //sets what button does
			
			public void handle(ActionEvent event) {
				answer.setText("/");
				operator = "/";
				flag = 1;
			}
		});
		
		equal = new Button("=");
		equal.setOnAction(new EventHandler<ActionEvent>() { //sets what button does
			
			public void handle(ActionEvent event) {
				double result = 0; 
				double pre, post;
				if (preop.compareTo("") == 0) {
					pre = ans;
				}
				else {
					pre = Double.parseDouble(preop);
				}
				switch (operator) {
				case "log":
					result = Math.log10(pre);
					answer.setText(Double.toString(result));
					break;
				case "+":
					post = Double.parseDouble(postop);
					result = pre + post;
					answer.setText(Double.toString(result));
					break;
				case "-":
					post = Double.parseDouble(postop);
					result = pre - post;
					answer.setText(Double.toString(result));
					break;
				case "*":
					post = Double.parseDouble(postop);
					result = pre * post;
					answer.setText(Double.toString(result));
					break;
				case "/":
					post = Double.parseDouble(postop);
					if (post == 0) {
						answer.setText("Error");
					}
					else {
						result = pre / post;
						answer.setText(Double.toString(result));
					}
					break;
				
				}
				ans = result;
				preop = "";
				postop = "";
				operator = "";
				flag = 0;
			}
		});
		decimal = new Button(".");
		decimal.setOnAction(new EventHandler<ActionEvent>() { //sets what button does
			
			public void handle(ActionEvent event) {
				if(flag == 0) {
					answer.setText(preop + ".");
					preop = preop + ".";
				}
				else {
					answer.setText(postop + ".");
					postop = postop + ".";
					
				}
			}
		});
		
		//numbers
		one = new Button("1");
		one.setOnAction(new EventHandler<ActionEvent>() { //sets what button does
			
			public void handle(ActionEvent event) {
				if(flag == 0) {
					answer.setText(preop + "1");
					preop = preop + "1";
				}
				else {
					answer.setText(postop + "1");
					postop = postop + "1";
					
				}
			}
		});
		
		two = new Button("2");
		two.setOnAction(new EventHandler<ActionEvent>() { //sets what button does
			
			public void handle(ActionEvent event) {
				if(flag == 0) {
					answer.setText(preop + "2");
					preop = preop + "2";
				}
				else if (flag == 1){
					answer.setText(postop + "2");
					postop = postop + "2";
				}
			}
		});
		
		three = new Button("3");
		three.setOnAction(new EventHandler<ActionEvent>() { //sets what button does
			
			public void handle(ActionEvent event) {
				if(flag == 0) {
					answer.setText(preop + "3");
					preop = preop + "3";
				}
				else {
					answer.setText(postop + "3");
					postop = postop + "3";
				}
			}
		});
		
		four = new Button("4");
		four.setOnAction(new EventHandler<ActionEvent>() { //sets what button does
			
			public void handle(ActionEvent event) {
				if(flag == 0) {
					answer.setText(preop + "4");
					preop = preop + "4";
				}
				else {
					answer.setText(postop + "4");
					postop = postop + "4";
				}
			}
		});
		
		five = new Button("5");
		five.setOnAction(new EventHandler<ActionEvent>() { //sets what button does
			
			public void handle(ActionEvent event) {
				if(flag == 0) {
					answer.setText(preop + "5");
					preop = preop + "5";
				}
				else {
					answer.setText(postop + "5");
					postop = postop + "5";
				}
			}
		});
		
		six = new Button("6");
		six.setOnAction(new EventHandler<ActionEvent>() { //sets what button does
			
			public void handle(ActionEvent event) {
				if(flag == 0) {
					answer.setText(preop + "6");
					preop = preop + "6";
				}
				else {
					answer.setText(postop + "6");
					postop = postop + "6";
				}
			}
		});
		
		seven = new Button("7");
		seven.setOnAction(new EventHandler<ActionEvent>() { //sets what button does
			
			public void handle(ActionEvent event) {
				if(flag == 0) {
					answer.setText(preop + "7");
					preop = preop + "7";
				}
				else {
					answer.setText(postop + "7");
					postop = postop + "7";
				}
			}
		});
		
		eight = new Button("8");
		eight.setOnAction(new EventHandler<ActionEvent>() { //sets what button does
			
			public void handle(ActionEvent event) {
				if(flag == 0) {
					answer.setText(preop + "8");
					preop = preop + "8";
				}
				else {
					answer.setText(postop + "8");
					postop = postop + "8";

				}
			}
		});
		
		nine = new Button("9");
		nine.setOnAction(new EventHandler<ActionEvent>() { //sets what button does
			
			public void handle(ActionEvent event) {
				if(flag == 0) {
					answer.setText(preop + "9");
					preop = preop + "9";
				}
				else {
					answer.setText(postop + "9");
					postop = postop + "9";
				}
			}
		});
		
		zero = new Button("0");
		zero.setOnAction(new EventHandler<ActionEvent>() { //sets what button does
			
			public void handle(ActionEvent event) {
				if(flag == 0) {
					answer.setText(preop + "0");
					preop = preop + "0";
				}
				else {
					answer.setText(postop + "0");
					postop = postop + "0";
				}
			}
		});
		
		//adding to gridpane
		buttons.add(one, 0, 0);
		buttons.add(two, 1, 0);
		buttons.add(three, 2, 0);
		buttons.add(four, 0, 1);
		buttons.add(five, 1, 1);
		buttons.add(six, 2, 1);
		buttons.add(seven, 0, 2);
		buttons.add(eight, 1, 2);
		buttons.add(nine, 2, 2);
		buttons.add(zero, 1, 3);
		buttons.add(decimal, 0, 3);
		
		buttons.add(add, 3, 0);
		buttons.add(sub, 3, 1);
		buttons.add(mult, 3, 2);
		buttons.add(div, 3, 3);
		buttons.add(equal, 2, 3);
		
		buttons.add(clear, 0, 4, 4, 1);
		buttons.add(log, 2, 4);
		
		
		root.getChildren().addAll(answer, buttons); //node inside root
		//nums.getChildren().addAll(two);
		stage.show();
	}
}
