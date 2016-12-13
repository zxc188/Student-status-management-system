import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class xjglxt extends Application {
private Label l3=new Label();
private TextField yonghuming=new TextField();
private TextField mima=new TextField();
public void start(final Stage m){
Button btdl=new Button("��¼");
btdl.fontProperty().set(Font.font("Tahoma", FontWeight.NORMAL, 20));
GridPane grid=new GridPane();
grid.setHgap(10);
grid.setVgap(10);
grid.setPadding(new Insets(25, 25, 25, 25));
grid.setAlignment(Pos.CENTER);
Text t=new Text("��ӭ����!");
t.setFont(Font.font("Tahoma", FontWeight.NORMAL, 30));
grid.add(t, 0, 0);
Label l1=new Label("�û���:");
l1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
grid.add(l1, 0, 1);
grid.add(yonghuming, 1, 1);
Label l2=new Label("����:");
l2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
grid.add(l2, 0, 2);
grid.add(mima, 1, 2);
grid.add(btdl, 1, 3);
l3.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
grid.add(l3, 1, 4);
StackPane p=new StackPane();
Image i=new Image("http://p2.so.qhimg.com/bdr/_240_/t0158ca23f5828881f2.jpg");
ImageView im=new ImageView(i);
im.setFitHeight(350);
im.setFitWidth(600);
p.getChildren().addAll(im,grid);
Scene scene=new Scene(p,600,350);
m.setScene(scene);
m.setTitle("ѧ������ϵͳ");
//scene.getStylesheets().add(Login.class.getResource("login.css").toExternalForm());  
m.show();

//����¼��ť��Ӽ�����;
btdl.setOnAction(new EventHandler<ActionEvent>(){
	private MenuItem zengjia;
	private MenuItem shanchu;
	private MenuItem chazhao;
	private MenuItem xiugai;
	private MenuItem chakan;
	private MenuItem paixu;
	private MenuBar menuBar ;
	private Menu menuFile;
	//����ѧ���е����ð�ť
	private Button btcz;
	//����ѧ���е���Ӱ�ť
	private Button btlu;
	//ɾ��ѧ���е�ɾ����ť
	private Button btsc;
	//ɾ��ѧ���е�ȷ����ť
	private Button btyes;
	//ɾ��ѧ���еķ񶨰�ť
	private Button btno;
	//�Ա���
	private RadioButton man;
	//�Ա�Ů
	private RadioButton woman;
	//�ı�
	//private PrintWriter p;
	private  File f=new File("E:/ѧ������ϵͳ/ѧ����Ϣ.txt");
	private TextField t1;
	private ArrayList<String> student;
	private ArrayList<Student> person;
	private ArrayList<Student> person2;
	private int i;
	@Override
	public void handle(ActionEvent e) {
		// TODO Auto-generated method stub
		if(yonghuming.getText().equals("zxc")&&mima.getText().equals("123456")){
		
		menuBar = new MenuBar();
		  menuFile = new Menu("�˵�");
		  
	  
		 //������ѧ���ŵ���Ӽ�����
		 zengjia = new MenuItem("���ѧ��");
	        zengjia.setOnAction(new EventHandler<ActionEvent>(){

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					GridPane grid1=new GridPane();
					grid1.setHgap(10);
					grid1.setVgap(10);
					grid1.setAlignment(Pos.CENTER);
					final Label n1=new Label();
					grid1.setPadding(new Insets(25,25,25,25));
					btlu=new Button("¼��");
					btlu.fontProperty().set(Font.font("Tahoma", FontWeight.NORMAL, 15));
					btcz=new Button("����");
					btcz.fontProperty().set(Font.font("Tahoma", FontWeight.NORMAL, 15));
					GridPane g1=new GridPane();
					g1.setHgap(10);
					g1.setVgap(10);
					g1.add(btlu, 0, 0);
					g1.add(btcz, 2, 0);
					final TextField num=new TextField();
					final TextField name=new TextField();
					final TextField zhuanye=new TextField();
					final TextField nianji=new TextField();
					final TextField birth=new TextField();
					final TextField jidian=new TextField();
					man=new RadioButton("��");
					man.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
					woman=new RadioButton("Ů");
					woman.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
					ToggleGroup g=new ToggleGroup();
					man.setToggleGroup(g);
					woman.setToggleGroup(g);
					Label l6=new Label("�Ա�");
					l6.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
					Label l1=new Label("ѧ��");
					l1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
					grid1.add(l1, 0, 0);
					grid1.add(num, 2, 0);
					grid1.add(n1, 3, 0);
					Label l2=new Label("����");
					l2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
					grid1.add(l2, 0, 1);
					grid1.add(name, 2, 1);
					
					grid1.add(l6, 0, 2);
					grid1.add(man, 1, 2);
					grid1.add(woman, 2, 2);
					
					Label l3=new Label("רҵ");
					l3.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
					grid1.add(l3, 0, 3);
					grid1.add(zhuanye, 2, 3);
					
					Label l4=new Label("�꼶");
					l4.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
					grid1.add(l4, 0, 4);
					grid1.add(nianji, 2, 4);
					
					Label l5=new Label("����");
					l5.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
					grid1.add(l5, 0, 5);
					grid1.add(birth, 2, 5);
					Label l8=new Label("����");
					l8.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
					grid1.add(l8, 0, 6);
					grid1.add(jidian, 2, 6);
					grid1.add(g1, 1, 7);
					StackPane p=new StackPane();
					Image l=new Image("http://p3.so.qhimg.com/bdr/_240_/t01d4a19325ef1f9488.jpg");
					ImageView im=new ImageView(l);
					im.setFitHeight(350);
					im.setFitWidth(600);
					p.getChildren().addAll(im,grid1);
					//Ϊ���õ���Ӽ�����
					btcz.setOnAction(new EventHandler<ActionEvent>(){

						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
						num.setText(null);
						name.setText(null);
						zhuanye.setText(null);
						nianji.setText(null);
						birth.setText(null);
						n1.setText(null);
						jidian.setText(null);
						}
						
					});

                    //Ϊ�����Ӽ�����
					btlu.setOnAction(new EventHandler<ActionEvent>(){

						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							try {
								Scanner input=new Scanner(f);
								student=new ArrayList<String>();
								for(;input.hasNext();){
									student.add(input.next());
								}
								for(i=0;i<student.size()&&student.get(i)!=num.getText();i++);
								
							} catch (FileNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							if(student.contains(num.getText())){
							n1.setText("����ͬ��ѧ��");
							n1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
							}
							else{
							
							try {
								FileWriter w=new FileWriter(f,true);
								
								w.write(num.getText()+" ");
							    
								w.write(name.getText()+" ");
								if(man.isSelected()){
									w.write("��"+" ");
								}
								else if(woman.isSelected()){
									w.write("Ů"+" ");
								}
								
								w.write(zhuanye.getText()+" ");
								w.write(nianji.getText()+" ");
								w.write(birth.getText()+" ");
								w.write(jidian.getText()+" ");
								w.close();
								
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							//System.out.println(student.toString());
							}
						}
						
					});
			
					Scene scene2 = new Scene(new VBox(), 600, 350);
					((VBox) scene2.getRoot()).getChildren().addAll(menuBar,p);
					m.setScene(scene2);
					m.show();
				}
	        });
	       
	     
	     //��ɾ��ѧ�����һ��������  
	     shanchu = new MenuItem("ɾ��ѧ��");
	     shanchu.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				  
				  GridPane grid2=new GridPane();
			       Label l1=new Label("��������Ҫɾ����ѧ����ѧ��:");
			       l1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
			       t1=new TextField();
			       btsc=new Button("ɾ��");
			       btsc.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
			       grid2.setAlignment(Pos.CENTER);
			       grid2.setHgap(10);
			       grid2.setVgap(10);
			       grid2.add(l1, 0, 0);
			       grid2.add(t1, 1, 0);
			       grid2.add(btsc, 1, 1);
			       StackPane p=new StackPane();
					Image l=new Image("http://p3.so.qhimg.com/bdr/_240_/t01d4a19325ef1f9488.jpg");
					ImageView im=new ImageView(l);
					im.setFitHeight(350);
					im.setFitWidth(600);
					p.getChildren().addAll(im,grid2);
			       //Ϊɾ����Ӽ�����
			       btsc.setOnAction(new EventHandler<ActionEvent>(){

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						try {
							Scanner input=new Scanner(f);
							student=new ArrayList<String>();
							for(;input.hasNext();){
								student.add(input.next());
							}
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					GridPane grid3=new GridPane();
					grid3.setAlignment(Pos.CENTER);
					Label lqr=new Label("��ȷ��Ҫɾ�����ѧ����?");
					lqr.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
					btyes=new Button("Yes");
					btyes.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
					//λȷ����ť��Ӽ�����
                    btyes.setOnAction(new EventHandler<ActionEvent>(){
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							student.remove(student.indexOf(t1.getText())+6);
							student.remove(student.indexOf(t1.getText())+6-1);
							student.remove(student.indexOf(t1.getText())+6-2);
							student.remove(student.indexOf(t1.getText())+6-3);
							student.remove(student.indexOf(t1.getText())+6-4);
							student.remove(student.indexOf(t1.getText())+6-5);
							student.remove(student.indexOf(t1.getText()));
							try {
								PrintWriter a=new PrintWriter(f);
								a.print("");
								a.close();
							} catch (FileNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							try {
								FileWriter b=new FileWriter(f,true);
								for(int i=0;i<student.size();i++){
								b.write(student.get(i)+" ");	
								}
								b.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							GridPane grid4=new GridPane();
						    Label wc=new Label("��ѡ���ѧ���Ѿ�ɾ��!!");
						    wc.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
						    grid4.add(wc, 0, 0);
						    grid4.setAlignment(Pos.CENTER);
						    StackPane p=new StackPane();
							Image l=new Image("http://p3.so.qhimg.com/bdr/_240_/t01d4a19325ef1f9488.jpg");
							ImageView im=new ImageView(l);
							im.setFitHeight(350);
							im.setFitWidth(600);
							p.getChildren().addAll(im,grid4);
						    Scene scene4 = new Scene(new VBox(), 600, 350);
							((VBox) scene4.getRoot()).getChildren().addAll(menuBar,p);
			                 m.setScene(scene4);
			                 m.show();
						}
						
					});
					
					
					btno=new Button("No");
					btno.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
					//Ϊȡ����ť��Ӽ�����
                    btno.setOnAction(new EventHandler<ActionEvent>(){

						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							
							
							GridPane grid5=new GridPane();
							 Label l1=new Label("��������Ҫɾ����ѧ����ѧ��:");
						       l1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
						       TextField t1=new TextField();
						       grid5.setAlignment(Pos.CENTER);
						       grid5.setHgap(10);
						       grid5.setVgap(10);
						       grid5.add(l1, 0, 0);
						       grid5.add(t1, 1, 0);
						       grid5.add(btsc, 1, 1);
						       StackPane p=new StackPane();
								Image l=new Image("http://p3.so.qhimg.com/bdr/_240_/t01d4a19325ef1f9488.jpg");
								ImageView im=new ImageView(l);
								im.setFitHeight(350);
								im.setFitWidth(600);
								p.getChildren().addAll(im,grid5);
						    Scene scene4 = new Scene(new VBox(), 600, 350);
							((VBox) scene4.getRoot()).getChildren().addAll(menuBar,p);
			                 m.setScene(scene4);
			                 m.show();
						}
						
					});
					
					
					grid3.add(lqr, 0, 0);
					grid3.add(btyes, 0, 1);
					grid3.add(btno, 1, 1);
					grid3.setAlignment(Pos.CENTER);
					grid3.setHgap(10);
				    grid3.setVgap(10);
				    StackPane p=new StackPane();
					Image l=new Image("http://p3.so.qhimg.com/bdr/_240_/t01d4a19325ef1f9488.jpg");
					ImageView im=new ImageView(l);
					im.setFitHeight(350);
					im.setFitWidth(600);
					p.getChildren().addAll(im,grid3);
					Scene scene4 = new Scene(new VBox(), 600, 350);
					((VBox) scene4.getRoot()).getChildren().addAll(menuBar,p);
					m.setScene(scene4);
					m.show();
					}
			       });
					
			       
			        Scene scene3 = new Scene(new VBox(), 600, 350);
					((VBox) scene3.getRoot()).getChildren().addAll(menuBar,p);
	                 m.setScene(scene3);
	                 m.show();
			}
	    	 
	     });
	     
	     
	     //������ѧ����Ӽ�����
	     chazhao = new MenuItem("����ѧ��");
	     chazhao.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				GridPane grid6=new GridPane();
				Label lx=new Label("������Ҫ���ҵ�ѧ��:");
				lx.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
				final TextField t1=new TextField();
				Button btc=new Button("��ѯ");
				btc.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
		        grid6.add(lx, 0, 0);
		        grid6.add(t1, 2, 0);
		        grid6.add(btc, 1, 1);
				Label xingming=new Label("����");
				xingming.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
				final TextField t2=new TextField();
			     grid6.add(xingming, 0, 2);
			     grid6.add(t2, 2, 2);
				Label lxingbie=new Label("�Ա�");
				lxingbie.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
				grid6.add(lxingbie, 0, 3);
				final TextField t9=new TextField();
				grid6.add(t9, 2, 3);
				final TextField t3=new TextField();
				final TextField t4=new TextField();
				final TextField t5=new TextField();
				final TextField t6=new TextField();
				Label lzhuanye=new Label("רҵ");
				lzhuanye.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
				Label lnianji=new Label("�꼶");
				lnianji.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
				Label lchusheng=new Label("����");
				lchusheng.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
				Label ljidian=new Label("����");
				ljidian.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
				grid6.add(lzhuanye, 0, 4);
				grid6.add(t3, 2, 4);
				grid6.add(lnianji, 0, 5);
				grid6.add(t4, 2, 5);
				grid6.add(lchusheng, 0, 6);
				grid6.add(t5, 2, 6);
				grid6.add(ljidian, 0, 7);
				grid6.add(t6, 2, 7);
				t5.setEditable(false);
				t4.setEditable(false);
				t3.setEditable(false);
				t2.setEditable(false);
				StackPane p=new StackPane();
				Image l=new Image("http://p3.so.qhimg.com/bdr/_240_/t01d4a19325ef1f9488.jpg");
				ImageView im=new ImageView(l);
				im.setFitHeight(350);
				im.setFitWidth(600);
				p.getChildren().addAll(im,grid6);
				
				//�����Ұ�ť��Ӽ�����
				btc.setOnAction(new EventHandler<ActionEvent>(){
                  
					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						try {
							Scanner input=new Scanner(f);
							student=new ArrayList<String>();
							for(;input.hasNext();){
								student.add(input.next());
							}
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						if(student.get(student.indexOf(t1.getText())+6)!=" "){
							t6.setText(student.get(student.indexOf(t1.getText())+6));
						}
						if(student.get(student.indexOf(t1.getText())+6-1)!=" "){
							t5.setText(student.get(student.indexOf(t1.getText())+6-1));
						}
						if(student.get(student.indexOf(t1.getText())+6-5)!=" "){
							t2.setText(student.get(student.indexOf(t1.getText())+6-5));
						}
						if(student.get(student.indexOf(t1.getText())+6-4)!=" "){
							t3.setText(student.get(student.indexOf(t1.getText())+6-4));
						}
						if(student.get(student.indexOf(t1.getText())+6-3)!=" "){
							t9.setText(student.get(student.indexOf(t1.getText())+6-3));
						}
						if(student.get(student.indexOf(t1.getText())+6-2)!=" "){
							t4.setText(student.get(student.indexOf(t1.getText())+6-2));
						}
						
						}	
				});
				
				
				grid6.setAlignment(Pos.CENTER);
				grid6.setHgap(10);
				grid6.setVgap(10);
				Scene scene = new Scene(new VBox(), 600, 350);
				((VBox) scene.getRoot()).getChildren().addAll(menuBar,p);	
				m.setScene(scene);
				m.show();
			}
	    	 
	     });
	     
	     
	     //���޸�ѧ������һ��������
	     xiugai = new MenuItem("�޸�ѧ��");      
	     xiugai.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				GridPane grid7=new GridPane();
				Label lx=new Label("������Ҫ�޸ĵ�ѧ��:");
				lx.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
				final TextField t1=new TextField();
				Button btxg=new Button("�޸�");
				btxg.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
		        grid7.add(lx, 0, 0);
		        grid7.add(t1, 2, 0);
		        grid7.add(btxg, 1, 1);
				Label lxingming=new Label("����");
				lxingming.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
				final TextField t2=new TextField();
			     grid7.add(lxingming, 0, 2);
			     grid7.add(t2, 2, 2);
				Label lxingbie=new Label("�Ա�");
				lxingbie.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
				man=new RadioButton("��");
				man.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
				woman=new RadioButton("Ů");
				woman.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
				ToggleGroup g=new ToggleGroup();
				man.setToggleGroup(g);
				woman.setToggleGroup(g);
				grid7.add(lxingbie, 0, 3);
				grid7.add(man, 1, 3);
				grid7.add(woman, 2, 3);
				final TextField t3=new TextField();
				final TextField t4=new TextField();
				final TextField t5=new TextField();
				final TextField t6=new TextField();
				Label lzhuanye=new Label("��רҵ");
				lzhuanye.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
				Label lnianji=new Label("���꼶");
				lnianji.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
				Label lchusheng=new Label("�³���");
				lchusheng.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
				Label ljidian=new Label("�¼���");
				ljidian.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
				grid7.add(lzhuanye, 0, 4);
				grid7.add(t3, 2, 4);
				grid7.add(lnianji, 0, 5);
				grid7.add(t4, 2, 5);
				grid7.add(lchusheng, 0, 6);
				grid7.add(t5, 2, 6);
				grid7.add(ljidian, 0, 7);
				grid7.add(t6, 2, 7);
				StackPane p=new StackPane();
				Image l=new Image("http://p3.so.qhimg.com/bdr/_240_/t01d4a19325ef1f9488.jpg");
				ImageView im=new ImageView(l);
				im.setFitHeight(350);
				im.setFitWidth(600);
				p.getChildren().addAll(im,grid7);
				
				
				//���޸İ�ť��Ӽ�����
				btxg.setOnAction(new EventHandler<ActionEvent>(){

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						try {
							Scanner input=new Scanner(f);
							student=new ArrayList<String>();
							for(;input.hasNext();){
								student.add(input.next());
							}
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						student.remove(student.indexOf(t1.getText())+6);
						student.remove(student.indexOf(t1.getText())+6-1);
						student.remove(student.indexOf(t1.getText())+6-2);
						student.remove(student.indexOf(t1.getText())+6-3);
						student.remove(student.indexOf(t1.getText())+6-4);
						student.remove(student.indexOf(t1.getText())+6-5);
						student.remove(student.indexOf(t1.getText()));
						try {
							PrintWriter a=new PrintWriter(f);
							a.print("");
							a.close();
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							FileWriter b=new FileWriter(f,true);
							for(int i=0;i<student.size();i++){
							b.write(student.get(i)+" ");	
							}
							b.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						 try {
								FileWriter w=new FileWriter(f,true);
								
								w.write(t1.getText()+" ");
								w.write(t2.getText()+" ");
								if(man.isSelected()){
									w.write("��"+" ");
								}
								else{
									w.write("Ů"+" ");
								}
								
								w.write(t3.getText()+" ");
								w.write(t4.getText()+" ");
								w.write(t5.getText()+" ");
								w.write(t6.getText());
								w.close();
								
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						
					}
					
				});
				
				
				grid7.setAlignment(Pos.CENTER);
				grid7.setHgap(10);
				grid7.setVgap(10);
				 Scene scene1 = new Scene(new VBox(), 600, 350);
				 ((VBox) scene1.getRoot()).getChildren().addAll(menuBar,p);
				 m.setScene(scene1);
				 m.show();  	
			}
	     
	     });
	     
	     
	   /*  chakan=new MenuItem("ѧ����Ϣ");
	     chakan.setOnAction(new EventHandler<ActionEvent>(){
	  
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			    TableView<Student> table = new TableView<>(); 
			       TableColumn n1 = new TableColumn("ѧ��");
			     n1.setMinWidth(100);
			        TableColumn n2 = new TableColumn("����");
			        n2.setMinWidth(100);
			        TableColumn x3 = new TableColumn("�Ա�");
			        x3.setMinWidth(100);
			        TableColumn z4 = new TableColumn("רҵ");
			        z4.setMinWidth(100);
			        TableColumn  n5= new TableColumn("�꼶");
			        n5.setMinWidth(100);
					TableColumn n6 = new TableColumn("��������");
					n6.setMinWidth(100);
				     n1.setCellValueFactory(
				    		 new PropertyValueFactory<>("number"));
				      n2.setCellValueFactory(
				    		  new PropertyValueFactory<>("name"));
				      x3.setCellValueFactory(
				    		  new PropertyValueFactory<>("xingbie"));
				      z4.setCellValueFactory(
				    		  new PropertyValueFactory<>("zhuanye"));
				      n5.setCellValueFactory(
				    		  new PropertyValueFactory<>("nianji"));
				     n6.setCellValueFactory(
				    		 new PropertyValueFactory<>("chusheng"));
				      final ObservableList<Student> data =  
					            FXCollections.observableArrayList(  
					            new Student("sdf","sdf","asd","asd","asd","asd"),
					            new Student("sdf","sdf","asd","asd","asd","asd")
					            ); 
				      table.setItems(data); 
				      table.getColumns().addAll(n1,n2,x3,z4,n5,n6);

				      Scene scene15 = new Scene(new Group()); 
				      final VBox vbox = new VBox();  
				        vbox.setSpacing(5);  
				        vbox.setPadding(new Insets(10, 0, 0, 10));  
				        vbox.getChildren().addAll(table);  
				   
				        ((Group) scene15.getRoot()).getChildren().addAll(vbox); 
				 m.setScene(scene15);
				 m.show();    
			}
	    	 
	     });
	     */
	     paixu=new MenuItem("ѧ������");
	     paixu.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				GridPane grid20=new GridPane();
				Label l=new Label("�����������ѯ�ļ�������������");
			    l.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
			    final TextField t=new TextField();
			    Button btc=new Button("��ѯ");
			    final Label l2=new Label();
			    final Label l3=new Label();
			    btc.setOnAction(new EventHandler<ActionEvent>(){

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
					try {
						person=new ArrayList<Student>();
						person2=new ArrayList<Student>();
						student=new ArrayList<String>();
						Scanner input=new Scanner(f);
						while(input.hasNext()){
						student.add(input.next());
						}
						
						for(int i=0;i<student.size();i=i+7){
						person.add(new Student(student.get(i),student.get(i+1),student.get(i+2),student.get(i+3),
								student.get(i+4),student.get(i+5),student.get(i+6)));
						}
						
						int a;
						int b;
						for(a=0;a<person.size();a++){
							for(b=a;b<person.size();b++){
								while(Integer.parseInt(person.get(a).jidian)<Integer.parseInt(person.get(b).jidian)){
									Student s=new Student();
									s=person.get(a);
									person.set(a, person.get(b));
									person.set(b, s);
								}
							}
						}
						l2.setText("���ѧ����ѧ��Ϊ:");
						l3.setText(person.get(Integer.parseInt(t.getText())-1).number);
						
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
					}
			    	
			    });
			    
			    
			    btc.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
			    grid20.add(l, 0, 0);
			    grid20.add(t, 0, 1);
			    grid20.add(btc, 0, 2);
			    l2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
			    l3.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));
			    grid20.add(l2, 0, 3);
			    grid20.add(l3, 2, 3);
			    
			    grid20.setAlignment(Pos.CENTER);
			    StackPane p=new StackPane();
			    Image i=new Image("http://p3.so.qhimg.com/bdr/_240_/t01d4a19325ef1f9488.jpg");
			    ImageView im=new ImageView(i);
			    im.setFitHeight(350);
			    im.setFitWidth(600);
			    p.getChildren().addAll(im,grid20);
			    Scene scene20 = new Scene(new VBox(), 600, 350);
				 ((VBox) scene20.getRoot()).getChildren().addAll(menuBar,p);
				 m.setScene(scene20);
				 m.show();
			}
	    	 
	     });
	     
	     
	     menuFile.getItems().addAll(zengjia,shanchu,chazhao,xiugai,paixu);
		 menuBar.getMenus().addAll(menuFile);
		 StackPane p=new StackPane();
			Image l=new Image("http://p4.so.qhimg.com/bdr/_240_/t010e5b33acb9f3a2a9.jpg");
			ImageView im=new ImageView(l);
			im.setFitHeight(350);
			im.setFitWidth(600);
			p.getChildren().addAll(im);
		 Scene scene1 = new Scene(new VBox(), 600, 350);
		 ((VBox) scene1.getRoot()).getChildren().addAll(menuBar,p);
		 m.setScene(scene1);
		 m.show();    
		}
		else{
			l3.setText("�û������������!");
			l3.setFont(Font.font("Tahoma", FontWeight.NORMAL, 30));
		}
	}
		
});

}

public static void main(String[] args){
	Application.launch(args);

}
/*public static class Student{
	private final SimpleStringProperty name;
	private final SimpleStringProperty number;
	private final SimpleStringProperty xingbie;
	private final SimpleStringProperty nianji;
	private final SimpleStringProperty zhuanye;
	private final SimpleStringProperty chusheng;
	Student(String name,String number,String nianji,String zhuanye,String chusheng,String xingbie){
		this.name = new SimpleStringProperty(name);	
		this.number = new SimpleStringProperty(number);
		this.xingbie = new SimpleStringProperty(xingbie);
		this.zhuanye = new SimpleStringProperty(zhuanye);
		this.chusheng = new SimpleStringProperty(chusheng);
		this.nianji = new SimpleStringProperty(nianji);
	}
	public String getnumber() {  
        return number.get();  
    }  

    public void setnumber(String fName) {  
        number.set(fName);  
    }  
    public String getname() {  
        return name.get();  
    }  

    public void setname(String fName) {  
        name.set(fName);  
    }  
    public String getxingbie() {  
        return xingbie.get();  
    }  

    public void setxingbie(String fName) {  
        xingbie.set(fName);  
    }  
    public String getnianji() {  
        return  nianji.get();  
    }  

    public void setnianji(String fName) {  
        nianji.set(fName);  
    }  
    public String getzhuanye() {  
        return zhuanye.get();  
    }  

    public void setzhuanye(String fName) {  
        zhuanye.set(fName);  
    }  
    public String getchuasheng() {  
        return chusheng.get();  
    }  

    public void setchusheng(String fName) {  
        chusheng.set(fName);  
    }  
}*/
}
class Student{
	String name;
	String number;
	String xingbie;
	String zhuanye;
	String nianji;
	String chusheng;
	String jidian;
	Student(){
		
	}
	Student(String number,String name,String xingbie,String zhuanye,String nianji,String chusheng,String jidian){
		this.name=name;
		this.number=number;
		this.nianji=nianji;
		this.xingbie=xingbie;
		this.jidian=jidian;
		this.zhuanye=zhuanye;
		this.chusheng=chusheng;
	}
}
