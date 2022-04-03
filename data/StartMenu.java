import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class StartMenu extends JFrame implements ActionListener{

	private JLabel fondo;
	private JButton nuevaPartida, cargarPartida;
	private JButton discord, facebook, twitter, youtube, twitch;

	public StartMenu(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("The Mignight");

		ImageIcon fondoImage = new ImageIcon("../resources/Textures/Background/TheMidNightBackground.png");
		ImageIcon nuevaPartidaImage = new ImageIcon("../resources/Textures/Buttons/nuevaPartida.png");
		ImageIcon cargarPartidaImage = new ImageIcon("../resources/Textures/Buttons/cargarPatida.png");
		ImageIcon Discord = new ImageIcon("../resources/Textures/Buttons/Discord.png");
		ImageIcon Youtube = new ImageIcon("../resources/Textures/Buttons/Youtube.png");
		ImageIcon Twitch = new ImageIcon("../resources/Textures/Buttons/Twitch.png");
		ImageIcon Twitter = new ImageIcon("../resources/Textures/Buttons/Twitter.png");
		ImageIcon Facebook = new ImageIcon("../resources/Textures/Buttons/Facebook.png");

		nuevaPartida = new JButton(nuevaPartidaImage);
		nuevaPartida.setBounds(500,275,375,50);
		nuevaPartida.setBorder(null);
		nuevaPartida.setBackground(new Color(0,0,0));
		nuevaPartida.setOpaque(false);
		nuevaPartida.addActionListener(this);
		add(nuevaPartida);

		discord = new JButton(Discord);
		discord.setBounds(820,150,50,50);
		discord.setBackground(new Color(0,0,0));
		discord.setOpaque(false);
		discord.setBorder(null);
		discord.addActionListener(this);
		add(discord);

		facebook = new JButton(Facebook);
		facebook.setBounds(50,430,50,50);
		facebook.setBackground(new Color(0,0,0));
		facebook.setOpaque(false);
		facebook.setBorder(null);
		facebook.addActionListener(this);
		add(facebook);

		twitter = new JButton(Twitter);
		twitter.setBounds(100,430,50,50);
		twitter.setBackground(new Color(0, 0, 0));
		twitter.setOpaque(false);
		twitter.setBorder(null);
		twitter.addActionListener(this);
		add(twitter);

		youtube = new JButton(Youtube);
		youtube.setBounds(150,430,50,50);
		youtube.setBackground(new Color(0,0,0));
		youtube.setOpaque(false);
		youtube.setBorder(null);
		youtube.addActionListener(this);
		add(youtube);

		twitch = new JButton(Twitch);
		twitch.setBounds(200,430,50,50);
		twitch.setBackground(new Color(0,0,0));
		twitch.setOpaque(false);
		twitch.setBorder(null);
		twitch.addActionListener(this);
		add(twitch);

		cargarPartida = new JButton(cargarPartidaImage);
		cargarPartida.setBounds(500,350,400,50);
		cargarPartida.setBorder(null);
		cargarPartida.setBackground(new Color(0,0,0));
		cargarPartida.addActionListener(this);
		cargarPartida.setOpaque(false);
		add(cargarPartida);

		fondo = new JLabel(fondoImage);
		fondo.setBounds(0,0,925,530);
		add(fondo);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == nuevaPartida) {

			try {

				Runtime run = Runtime.getRuntime();

				run.exec("buttons_data/CreateParty.bat");
				run.freeMemory();

			} catch (IOException err) {


			}

		} else if(e.getSource() == cargarPartida){

		}else if (e.getSource() == discord) {
              		  try {

                    	  Runtime run = Runtime.getRuntime();

                  	  run.exec("buttons_data/DiscordButton.bat");

             	      	 run.freeMemory();

       	   	      } catch (IOException err){

				}

		} else if(e.getSource() == twitch) {

              		  try {

                    	  Runtime run = Runtime.getRuntime();

                  	  run.exec("buttons_data/TwitchChannel.bat");

             	      	 run.freeMemory();

       	   	      } catch (IOException err){

				}

		} else if(e.getSource() == youtube) {

              		  try {

                    	  Runtime run = Runtime.getRuntime();

                  	  run.exec("buttons_data/YoutubeChannel.bat");

             	      	 run.freeMemory();

       	   	      } catch (IOException err){

				}

		} else if(e.getSource() == facebook) {

              		  try {

                    	  Runtime run = Runtime.getRuntime();

                  	  run.exec("buttons_data/FacebookPerfil.bat");

             	      	 run.freeMemory();

       	   	      } catch (IOException err){

				}
 
		} else if(e.getSource() == twitter) {

              		  try {

                    	  Runtime run = Runtime.getRuntime();

                  	  run.exec("buttons_data/TwitterPerfil.bat");

             	      	 run.freeMemory();

       	   	      } catch (IOException err){

				}

		}
	}	

	public static void main(String[] args){
		StartMenu menuMain = new StartMenu();
		menuMain.setVisible(true);
		menuMain.setBounds(0,0,925,530);
		menuMain.setResizable(false);
		menuMain.setLocationRelativeTo(null);
	}
}