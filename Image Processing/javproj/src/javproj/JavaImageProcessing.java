package javproj;

import javax.swing.*;
import java.awt.image.*;
import java.io.*;
import java.net.URL;

import javax.imageio.*;
import java.awt.*;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.geom.*;
import javax.swing.event.*;
import javax.swing.plaf.basic.BasicMenuUI.*;
import java.awt.*;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.plaf.basic.BasicMenuUI.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class JavaImageProcessing extends javax.swing.JFrame 
{
	
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel l6;
	private javax.swing.JPanel p1;
	private javax.swing.JButton b2;
	BufferedImage image = null;
	BufferedImage image1 = null;
	BufferedImage image2 = null;
	BufferedImage originalImage = null;
	BufferedImage previewImage = null;
	BufferedImage[] imageWorkQueue = new BufferedImage[30];
	private javax.swing.JButton jButton30;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel36;
	private javax.swing.JLabel jLabel37;
	private javax.swing.JLabel jLabel38;
	private javax.swing.JLabel jLabel39;
	private javax.swing.JLabel jLabel40;
	private javax.swing.JLabel jLabel41;
	private javax.swing.JLabel jLabel42;
	private javax.swing.JLabel jLabel43;
	private javax.swing.JPanel jPanel30;
	private javax.swing.JScrollPane jScrollPane30;
	private javax.swing.JTextArea jTextArea30;
	private javax.swing.JButton jButton50;
	private javax.swing.JLabel jLabel50;
	private javax.swing.JLabel jLabel51;
	private javax.swing.JLabel jLabel52;
	private javax.swing.JLabel jLabel53;
	private javax.swing.JLabel jLabel54;
	private javax.swing.JLabel jLabel56;
	private javax.swing.JLabel jLabel57;
	private javax.swing.JPanel jPanel50;
	private javax.swing.JScrollPane jScrollPane50;
	private javax.swing.JTextArea jTextArea50;
	private javax.swing.JButton jButton60;
	private javax.swing.JPanel jPanel60;

	private final int HISTORY_SIZE = 30;
	private static int currentImageIndex = 0;
	private static int mainSliderPrevValue = 50;
	private static char currentAction = ' ';
	private boolean isHistoryFull = false;
	private JButton btnGrey;
	private JButton btnBlur;
	private JButton btnInvert;
	private JButton btnSharpen;
	private JPanel panel_1;
	private JButton btnHorFlip;
	private JButton btnVerFlip;
	private JPanel panel_2;
	private JButton btnBlue;
	private JButton btnGreen;
	private JButton btnRed;
	private JPanel panel_3;
	private JButton btnOut;
	private JButton btnIn;
	private JButton btn180;
	private JMenuBar menuBar;
	private JMenu mnFiles;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JMenu mnShortcuts;
	private JMenu mnHelp;
	private JMenuItem mntmUndo;
	private JMenuItem mntmHelp;
	private JPanel panelKeys;

	/** Creates new form jfr1 */
	public JavaImageProcessing() {
		
		//help();
		opening();
		//com();
		//initComponents();
	}

	public void opening() {
		setTitle("PiEdits");
		setIconImage(Toolkit.getDefaultToolkit().getImage(JavaImageProcessing.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		jPanel60 = new javax.swing.JPanel();
		jButton60 = new javax.swing.JButton();
		jButton60.setBackground(new Color(245, 255, 250));
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		jPanel60.setBackground(UIManager.getColor("CheckBox.background"));
		jPanel60.setName("jPanel60"); // NOI18N
		jButton60.setIcon(new ImageIcon("D:\\eclipse\\workspace\\JavaProjImgProc\\javproj\\src\\vgdf.png")); // NOI18N
		// jButton60.setText("jButton1");
		jButton60.setName("jButton60"); // NOI18N
		jButton60.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton60ActionPerformed(evt);
			}
		});
		
		JLabel lblNewLabel = new JLabel("Welcome to PiEdits");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 30));
		
		JLabel lblclickAnyPicture = new JLabel("(click any picture)");
		javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
		jPanel60Layout.setHorizontalGroup(
			jPanel60Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel60Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel60Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jButton60, GroupLayout.PREFERRED_SIZE, 1225, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, jPanel60Layout.createSequentialGroup()
							.addComponent(lblclickAnyPicture)
							.addGap(35))))
				.addGroup(jPanel60Layout.createSequentialGroup()
					.addGap(489)
					.addComponent(lblNewLabel)
					.addContainerGap(509, Short.MAX_VALUE))
		);
		jPanel60Layout.setVerticalGroup(
			jPanel60Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel60Layout.createSequentialGroup()
					.addContainerGap(181, Short.MAX_VALUE)
					.addComponent(jButton60)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblclickAnyPicture)
					.addGap(42)
					.addComponent(lblNewLabel)
					.addGap(81))
		);
		jPanel60.setLayout(jPanel60Layout);
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel60, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel60, GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
		);
		getContentPane().setLayout(layout);
		pack();
		//
	}

	private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jPanel60.setVisible(false);
	com();
	}

	void com() {
	
		setTitle("PiEdits");
	setIconImage(Toolkit.getDefaultToolkit().getImage(JavaImageProcessing.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
	getContentPane().setBackground(UIManager.getColor("Button.light"));
	setResizable(true);
	
	menuBar = new JMenuBar();
	setJMenuBar(menuBar);
	
	mnFiles = new JMenu(" Files |");
	menuBar.add(mnFiles);
	
	mntmOpen = new JMenuItem("Open");
	mntmOpen.setIcon(new ImageIcon(JavaImageProcessing.class.getResource("/com/sun/java/swing/plaf/windows/icons/Directory.gif")));
	mntmOpen.setAccelerator(
			javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
	mntmOpen.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			OpenActionPerformed(evt);
		}
	});
	mnFiles.add(mntmOpen);
	
	mntmSave = new JMenuItem("Save");
	mntmSave.setIcon(new ImageIcon(JavaImageProcessing.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
	mntmSave.setAccelerator(
			javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
	mntmSave.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			SaveActionPerformed(evt);
		}
	});
	mnFiles.add(mntmSave);
	
	mntmExit = new JMenuItem("Exit");
	mntmExit.setAccelerator(
			javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
	mntmExit.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			ExitActionPerformed(evt);
		}
	});
	mnFiles.add(mntmExit);
	
	mnShortcuts = new JMenu(" Shortcuts |");
	menuBar.add(mnShortcuts);
	
	mntmUndo = new JMenuItem("Undo");
	mntmUndo.setAccelerator(
			javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
	mntmUndo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
			UndoActionPerformed(evt);
		}
	});
	mntmUndo.setIcon(new ImageIcon(JavaImageProcessing.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
	mnShortcuts.add(mntmUndo);
	
	mnHelp = new JMenu(" Help |");

	menuBar.add(mnHelp);
	
	mntmHelp = new JMenuItem("help");
	mntmHelp.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
			HelpActionPerformed(evt);
		}
	});
	mnHelp.add(mntmHelp);
	initComponents();
	}
	
	private void initComponents() 
	{
		
		jScrollPane1 = new javax.swing.JScrollPane();
		jLabel1 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(Color.LIGHT_GRAY);
		setForeground(SystemColor.desktop);
		jScrollPane1.setName("jScrollPane1"); // NOI18N
		jLabel1.setBackground(UIManager.getColor("CheckBox.background"));
		jLabel1.setName("jLabel1"); // NOI18N
		jScrollPane1.setRowHeaderView(jLabel1);

		panelKeys = new JPanel();
		panelKeys.setBackground(SystemColor.inactiveCaptionBorder);
		panelKeys.setBorder(new TitledBorder(null, "Tools", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(panelKeys, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
						.addComponent(panelKeys, GroupLayout.PREFERRED_SIZE, 718, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);

		JButton btnBlur = new JButton("Blur Image");
		btnBlur.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BlurActionPerformed(evt);
			}
		});

		btnGrey = new JButton("Grey Image");
		btnGrey.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				GreyActionPerformed(evt);
			}
		});

		btnInvert = new JButton("Invert Image");
		btnInvert.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				InvertActionPerformed(evt);
			}
		});

		btnSharpen = new JButton("Sharpen");
		btnSharpen.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SharpenActionPerformed(evt);
			}
		});
		

		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Mirror Flip",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));

		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Eye View", TitledBorder.CENTER,
				TitledBorder.TOP, null, new Color(0, 0, 0)));

		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Zoom", TitledBorder.CENTER,
				TitledBorder.TOP, null, new Color(0, 0, 0)));

		btn180 = new JButton("Rotate 180");
		btn180.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				R180ActionPerformed(evt);
			}
		});
		GroupLayout gl_panelKeys = new GroupLayout(panelKeys);
		gl_panelKeys.setHorizontalGroup(
			gl_panelKeys.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelKeys.createSequentialGroup()
					.addGroup(gl_panelKeys.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelKeys.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panelKeys.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnGrey, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
								.addComponent(btnBlur, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
							.addGroup(gl_panelKeys.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panelKeys.createSequentialGroup()
									.addGap(18)
									.addComponent(btnInvert))
								.addGroup(gl_panelKeys.createSequentialGroup()
									.addGap(30)
									.addComponent(btnSharpen, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))))
						.addGroup(gl_panelKeys.createSequentialGroup()
							.addGap(11)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 234, Short.MAX_VALUE))
						.addGroup(gl_panelKeys.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
						.addGroup(gl_panelKeys.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panelKeys.createSequentialGroup()
					.addGap(77)
					.addComponent(btn180, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
					.addGap(70))
		);
		gl_panelKeys.setVerticalGroup(
			gl_panelKeys.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelKeys.createSequentialGroup()
					.addGap(71)
					.addGroup(gl_panelKeys.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBlur)
						.addComponent(btnInvert))
					.addGap(37)
					.addGroup(gl_panelKeys.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGrey)
						.addComponent(btnSharpen))
					.addGap(38)
					.addComponent(btn180)
					.addGap(54)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(179, Short.MAX_VALUE))
		);

		btnIn = new JButton("In");
		btnIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ZoomInActionPerformed(evt);
			}
		});
		
		panel_3.add(btnIn);

		btnOut = new JButton("Out");
		btnOut.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ZoomOutActionPerformed(evt);
			}
		});
		panel_3.add(btnOut);

		btnRed = new JButton("Red");
		btnRed.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				RedActionPerformed(evt);
			}
		});
		panel_2.add(btnRed);

		btnGreen = new JButton("Green");
		btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				GreenActionPerformed(evt);
			}
		});
		panel_2.add(btnGreen);

		btnBlue = new JButton("Blue");
		btnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				BlueActionPerformed(evt);
			}
		});
		panel_2.add(btnBlue);

		btnVerFlip = new JButton("Vertical Flip");
		btnVerFlip.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				VerticalFlipActionPerformed(evt);
			}
		});
		panel_1.add(btnVerFlip);

		btnHorFlip = new JButton("Horizontal Flip");
		btnHorFlip.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				HorizontalFlipActionPerformed(evt);
			}
		});
		panel_1.add(btnHorFlip);
		panelKeys.setLayout(gl_panelKeys);
		getContentPane().setLayout(layout);
		pack();
	}

	private void OpenActionPerformed(java.awt.event.ActionEvent evt) {
		JFileChooser jfcOpen = new JFileChooser("c:\\");
		jfcOpen.showOpenDialog(this);
		File input = jfcOpen.getSelectedFile();
		// ImageIcon img;
		try {
			image = ImageIO.read(input);
			image1 = ImageIO.read(input);
			image2 = ImageIO.read(input);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		jLabel1.setIcon(new ImageIcon(image.getScaledInstance(-1, -1, BufferedImage.SCALE_DEFAULT)));
		repaint();
		jScrollPane1.setViewportView(jLabel1);
		repaint();

	}

	private void ExitActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);

	}

	private void UndoActionPerformed(java.awt.event.ActionEvent evt) {
		image = image1;
		jLabel1.setIcon(new ImageIcon(image1.getScaledInstance(-1, -1, BufferedImage.SCALE_DEFAULT)));
		repaint();
		jScrollPane1.setViewportView(jLabel1);
		repaint();

	}

	private void SaveActionPerformed(java.awt.event.ActionEvent evt) {
		BufferedImage bi = image;
		JFileChooser jfcSave = new JFileChooser("c:\\");
		jfcSave.showSaveDialog(this);
		File outputfile = jfcSave.getSelectedFile();
		try {
			ImageIO.write(bi, "jpg", outputfile);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// save TODO add your handling code here:
	}

	private void HorizontalFlipActionPerformed(java.awt.event.ActionEvent evt) {
		currentAction = 'I';
		// setMenuItemEnabled(false);
		previewImage = flipHorizontal(imageWorkQueue[nextImageIndex(0)]);
		displayImage(previewImage);
		image = previewImage;
		// TODO add your handling code here:
	}

	private void VerticalFlipActionPerformed(java.awt.event.ActionEvent evt) {
		currentAction = 'I';
		// setMenuItemEnabled(false);
		previewImage = flipVertical(imageWorkQueue[nextImageIndex(0)]);
		displayImage(previewImage);
		image = previewImage;
		// TODO add your handling code here:
	}

	private void R180ActionPerformed(java.awt.event.ActionEvent evt) {
		currentAction = 'I';
		previewImage = flip180deg(imageWorkQueue[nextImageIndex(0)]);
		displayImage(previewImage);
		image = previewImage;// TODO add your handling code here:
	}

	private void ZoomOutActionPerformed(java.awt.event.ActionEvent evt) {
		currentAction = 'I';
		previewImage = nezoom200(imageWorkQueue[nextImageIndex(0)]);
		displayImage(previewImage);
		image = previewImage;
		// TODO add your handling code here:
	}


	private void ZoomInActionPerformed(java.awt.event.ActionEvent evt)
	{
		currentAction = 'I';
		previewImage = pezoom250(imageWorkQueue[nextImageIndex(0)]);
		displayImage(previewImage);
		image = previewImage;
	}

	
	private void SharpenActionPerformed(java.awt.event.ActionEvent evt) {
		currentAction = 'S';
		// setMenuItemEnabled(false);
		previewImage = Sharpen(imageWorkQueue[nextImageIndex(0)]);
		displayImage(previewImage);
		image = previewImage;
		// TODO add your handling code here:
	}

	private void BlueActionPerformed(java.awt.event.ActionEvent evt) {
		BufferedImage img = image;
		Color col;
		for (int x = 0; x < img.getWidth(); x++) { // width
			for (int y = 0; y < img.getHeight(); y++) { // height
				int RGBA = img.getRGB(x, y); // gets RGBA data for the specific pixel
				col = new Color(RGBA, true); // get the color data of the specific pixel
				col = new Color(1, 1, Math.abs(col.getBlue() - 255)); // Swaps values
				img.setRGB(x, y, col.getRGB()); // set the pixel to the altered colors
			}
		}
		Graphics2D gg = img.createGraphics();
		gg.drawImage(img, 0, 0, img.getWidth(null), img.getHeight(null), null);
		jLabel1.setIcon(new ImageIcon(img.getScaledInstance(-1, -1, BufferedImage.SCALE_DEFAULT)));
		image = img;
		repaint();
	}

	private void BlurActionPerformed(java.awt.event.ActionEvent evt) {
		currentAction = 'b';

		previewImage = Blur(imageWorkQueue[nextImageIndex(0)]);
		displayImage(previewImage);
		image = previewImage;
		image = image2;
	}

	private void GreenActionPerformed(java.awt.event.ActionEvent evt) {
		BufferedImage img = image;
		Color col;
		for (int x = 0; x < img.getWidth(); x++) { // width
			for (int y = 0; y < img.getHeight(); y++) { // height
				int RGBA = img.getRGB(x, y); // gets RGBA data for the specific pixel
				col = new Color(RGBA, true); // get the color data of the specific pixel
				col = new Color(1, Math.abs(col.getGreen() - 255), 1); // Swaps values
				img.setRGB(x, y, col.getRGB()); // set the pixel to the altered colors
			}
		}
		Graphics2D gg = img.createGraphics();
		gg.drawImage(img, 0, 0, img.getWidth(null), img.getHeight(null), null);
		jLabel1.setIcon(new ImageIcon(img.getScaledInstance(-1, -1, BufferedImage.SCALE_DEFAULT)));
		image = img;
		repaint();
		// TODO add your handling code here:
	}

	private void RedActionPerformed(java.awt.event.ActionEvent evt) {
		BufferedImage img = image;
		Color col;
		for (int x = 0; x < img.getWidth(); x++) { // width
			for (int y = 0; y < img.getHeight(); y++) { // height
				int RGBA = img.getRGB(x, y); // gets RGBA data for the specific pixel
				col = new Color(RGBA, true); // get the color data of the specific pixel
				col = new Color(Math.abs(col.getRed() - 255), 1, 1); // Swaps values
				img.setRGB(x, y, col.getRGB()); // set the pixel to the altered colors
			}
		}
		Graphics2D gg = img.createGraphics();
		gg.drawImage(img, 0, 0, img.getWidth(null), img.getHeight(null), null);
		jLabel1.setIcon(new ImageIcon(img.getScaledInstance(-1, -1, BufferedImage.SCALE_DEFAULT)));
		image = img;
		repaint();
		// TODO add your handling code here:
	}

	private void InvertActionPerformed(java.awt.event.ActionEvent evt) {
		double image_width = jLabel1.getWidth();
		double image_height = jLabel1.getHeight();
		BufferedImage bimg = null;
		BufferedImage img = image;
		Color col;
		for (int x = 0; x < img.getWidth(); x++) { // width
			for (int y = 0; y < img.getHeight(); y++) { // height
				int RGBA = img.getRGB(x, y); // gets RGBA data for the specific pixel
				col = new Color(RGBA, true); // get the color data of the specific pixel
				col = new Color(Math.abs(col.getRed() - 255), Math.abs(col.getGreen() - 255),
						Math.abs(col.getBlue() - 255)); // Swaps values
				img.setRGB(x, y, col.getRGB()); // set the pixel to the altered colors
			}
		}
		Graphics2D gg = img.createGraphics();
		gg.drawImage(img, 0, 0, img.getWidth(null), img.getHeight(null), null);
		jLabel1.setIcon(new ImageIcon(img.getScaledInstance(-1, -1, BufferedImage.SCALE_DEFAULT)));
		repaint();
		// TODO add your handling code here:
	}
	
	private void GreyActionPerformed(java.awt.event.ActionEvent evt) {
		currentAction = 'I';
		// setMenuItemEnabled(false);
		previewImage = greyImage(imageWorkQueue[nextImageIndex(0)]);
		displayImage(previewImage);
		image = previewImage;
		// TODO add your handling code here:
	}

	public BufferedImage pezoom250(BufferedImage img) {
		img = image;
		AffineTransform tx = AffineTransform.getScaleInstance(1.2, 1.2);
		tx.translate(1.2, 1.2);
		AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
		img = op.filter(img, null);
		return img;
	}


	public BufferedImage nezoom200(BufferedImage img) {
		img = image;
		AffineTransform tx = AffineTransform.getScaleInstance(0.8, 0.8);
		tx.translate(0.8, 0.8);
		AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
		img = op.filter(img, null);
		return img;
	}
private void HelpActionPerformed(ActionEvent evt) {
	//help h= new help();
	jScrollPane1.setVisible(false);
	panelKeys.setVisible(false);
	//JavaImageProcessing  jip= new JavaImageProcessing();
	//jip.opening();
	
	help1();
		
	}
public void help1() {
	//JavaImageProcessing j = new JavaImageProcessing();
	JFrame jf= new JFrame();
	//setBounds(maximizedBounds);
	setBounds(100, 100, 1130, 700);
	setIconImage(Toolkit.getDefaultToolkit().getImage(JavaImageProcessing.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
	setTitle("PiEdits");
	JPanel panel_5 = new JPanel();
	JPanel panel_4 = new JPanel();
	JPanel panel = new JPanel();
	JButton btnGoBack = new JButton("  Go Back");
	btnGoBack.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			btnGoBack.setVisible(false);
			panel.setVisible(false);
			panel_4.setVisible(false);
			panel_5.setVisible(false);
			com();
		}
	});
	btnGoBack.setIcon(new ImageIcon(JavaImageProcessing.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-enter-button.png")));
	
	
	panel.setBackground(UIManager.getColor("Button.highlight"));
	panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Short Cuts Used", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	
	
	panel_4.setBackground(UIManager.getColor("Button.highlight"));
	panel_4.setBorder(new TitledBorder(null, "Caution", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	
	
	panel_5.setBorder(new TitledBorder(null, "About the Developer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	panel_5.setBackground(UIManager.getColor("CheckBox.highlight"));
	
	JLabel lblDevelopedBy = new JLabel("Developed By : ");
	lblDevelopedBy.setFont(new Font("Tahoma", Font.PLAIN, 30));
	
	JLabel lblNewLabel_2 = new JLabel("Pranesh Ulleri ");
	lblNewLabel_2.setFont(new Font("Century", Font.BOLD, 34));
	
	JButton btnNewButton = new JButton("Git Hub");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			try {
			    Desktop.getDesktop().browse(new URL("https://github.com/RebelsterPi").toURI());
			} catch (Exception e) {}
		}
	});
	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
	
	JLabel lblLinks = new JLabel("Click the button to visit my :");
	lblLinks.setFont(new Font("Tahoma", Font.PLAIN, 21));
	
	JButton btnNewButton_1 = new JButton("LinkedIn");//https://www.linkedin.com/in/pranesh-ulleri-6pi6/
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			try {
			    Desktop.getDesktop().browse(new URL("https://www.linkedin.com/in/pranesh-ulleri-6pi6/").toURI());
			} catch (Exception e) {}
			
		}
	});
	btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
	
	JButton btnInstagram = new JButton("Instagram");
	btnInstagram.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			try {
			    Desktop.getDesktop().browse(new URL("https://www.instagram.com/pranesh_ulleri/").toURI());
			} catch (Exception e) {}
			
		}
	});
	btnInstagram.setFont(new Font("Tahoma", Font.PLAIN, 21));
	
	JButton btnFacebook = new JButton("FaceBook");//https://www.facebook.com/pranesh.ulleri
	btnFacebook.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			try {
			    Desktop.getDesktop().browse(new URL("https://www.facebook.com/pranesh.ulleri").toURI());
			} catch (Exception e) {}
			
		}
	});
	btnFacebook.setFont(new Font("Tahoma", Font.PLAIN, 21));
	
	JLabel lblIpraneshullerigmailcom = new JLabel("Mail me @ :  praneshulleri@gmail.com");
	lblIpraneshullerigmailcom.setFont(new Font("Tahoma", Font.PLAIN, 13));
	
	JButton btnBlog = new JButton("Blog");
	btnBlog.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			try {
			    Desktop.getDesktop().browse(new URL("https://www.rebelsterpi.wordpress.com").toURI());
			} catch (Exception e) {}
		}
	});
	btnBlog.setFont(new Font("Tahoma", Font.PLAIN, 21));
	
	JLabel lblUiuxDeveloperAndroid = new JLabel("UI/UX Developer, Android Dev., Video editing, Game Dev.");
	
	JLabel lblcodeTillGlory = new JLabel("\"Code till Glory\"");
	lblcodeTillGlory.setFont(new Font("Tahoma", Font.ITALIC, 13));
	GroupLayout gl_panel_5 = new GroupLayout(panel_5);
	gl_panel_5.setHorizontalGroup(
		gl_panel_5.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panel_5.createSequentialGroup()
				.addContainerGap()
				.addComponent(lblLinks)
				.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
				.addComponent(btnNewButton)
				.addGap(50)
				.addComponent(btnNewButton_1)
				.addGap(35)
				.addComponent(btnFacebook)
				.addGap(289))
			.addGroup(gl_panel_5.createSequentialGroup()
				.addGap(371)
				.addComponent(btnInstagram)
				.addGap(40)
				.addComponent(btnBlog, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(363, Short.MAX_VALUE))
			.addGroup(Alignment.TRAILING, gl_panel_5.createSequentialGroup()
				.addContainerGap(896, Short.MAX_VALUE)
				.addComponent(lblcodeTillGlory, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
				.addContainerGap())
			.addGroup(gl_panel_5.createSequentialGroup()
				.addContainerGap()
				.addComponent(lblDevelopedBy)
				.addGap(135)
				.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
					.addComponent(lblIpraneshullerigmailcom)
					.addComponent(lblUiuxDeveloperAndroid)
					.addComponent(lblNewLabel_2))
				.addContainerGap(328, Short.MAX_VALUE))
	);
	gl_panel_5.setVerticalGroup(
		gl_panel_5.createParallelGroup(Alignment.TRAILING)
			.addGroup(gl_panel_5.createSequentialGroup()
				.addGap(22)
				.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
					.addComponent(lblDevelopedBy)
					.addComponent(lblNewLabel_2))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(lblUiuxDeveloperAndroid)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(lblIpraneshullerigmailcom)
				.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
					.addComponent(btnNewButton)
					.addComponent(btnNewButton_1)
					.addComponent(btnFacebook)
					.addComponent(lblLinks))
				.addGap(18)
				.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
					.addComponent(btnInstagram)
					.addComponent(btnBlog))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(lblcodeTillGlory))
	);
	panel_5.setLayout(gl_panel_5);
	
	JLabel lblEyeView = new JLabel("Eye View : ");
	lblEyeView.setFont(new Font("Tahoma", Font.PLAIN, 18));
	
	JTextPane txtpnNoticedAProblem = new JTextPane();
	txtpnNoticedAProblem.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
	txtpnNoticedAProblem.setFont(new Font("Tahoma", Font.PLAIN, 14));
	txtpnNoticedAProblem.setText("Noticed a problem while using Eye views? \r\n\r\nYou can not use two different eye view for the same pic, well actually you can use, but the problem is that you will get just plain Colour (Red/Green/Blue ) respective to what you choose second time or Black . This because the picture takes out all the other two colour component when the first time the eye view is selected and shows only the eye view colour you choose and black.\r\nIf you choose the same colour view again, the current picture simply gets inverted! \r\n");
	
	JLabel lblTryItFor = new JLabel("try it for your self!");
	GroupLayout gl_panel_4 = new GroupLayout(panel_4);
	gl_panel_4.setHorizontalGroup(
		gl_panel_4.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panel_4.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
					.addComponent(lblTryItFor)
					.addGroup(gl_panel_4.createSequentialGroup()
						.addComponent(lblEyeView)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(txtpnNoticedAProblem, GroupLayout.PREFERRED_SIZE, 604, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)))
				.addContainerGap(24, Short.MAX_VALUE))
	);
	gl_panel_4.setVerticalGroup(
		gl_panel_4.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panel_4.createSequentialGroup()
				.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
					.addComponent(lblEyeView)
					.addComponent(txtpnNoticedAProblem, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
				.addGap(13)
				.addComponent(lblTryItFor)
				.addContainerGap(19, Short.MAX_VALUE))
	);
	panel_4.setLayout(gl_panel_4);
	
	JLabel lblNewLabel_1 = new JLabel("Open : CTRL + O");
	lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
	
	JLabel lblSaveCtrl = new JLabel("Save : CTRL + S");
	lblSaveCtrl.setFont(new Font("Tahoma", Font.PLAIN, 21));
	
	JLabel lblExitCtrl = new JLabel("Exit : CTRL + Q");
	lblExitCtrl.setFont(new Font("Tahoma", Font.PLAIN, 21));
	
	JLabel lblUndoCtrl = new JLabel("Undo : CTRL + z");
	lblUndoCtrl.setFont(new Font("Tahoma", Font.PLAIN, 21));
	GroupLayout gl_panel = new GroupLayout(panel);
	gl_panel.setHorizontalGroup(
		gl_panel.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
					.addComponent(lblNewLabel_1)
					.addComponent(lblSaveCtrl, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblExitCtrl, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblUndoCtrl, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(909, Short.MAX_VALUE))
	);
	gl_panel.setVerticalGroup(
		gl_panel.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panel.createSequentialGroup()
				.addGap(30)
				.addComponent(lblNewLabel_1)
				.addGap(18)
				.addComponent(lblSaveCtrl, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(lblExitCtrl, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(lblUndoCtrl, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	);
	panel.setLayout(gl_panel);
	GroupLayout groupLayout = new GroupLayout(getContentPane());
	groupLayout.setHorizontalGroup(
		groupLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(groupLayout.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(50)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(12)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(48)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 1025, GroupLayout.PREFERRED_SIZE))
					.addComponent(btnGoBack))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	);
	groupLayout.setVerticalGroup(
		groupLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(groupLayout.createSequentialGroup()
				.addComponent(btnGoBack, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
				.addGap(26)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE))
	);
	getContentPane().setLayout(groupLayout);
	
}	
	public BufferedImage Sharpen(BufferedImage img) {
		img = image;
		float data[] = { -1.0f, -1.0f, -1.0f, -1.0f, 9.0f, -1.0f, -1.0f, -1.0f, -1.0f };
		Kernel kernel = new Kernel(3, 3, data);
		ConvolveOp convolve = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP, null);
		convolve.filter(img, image2);
		// image=image1;
		return image2;
	}

	public BufferedImage Blur(BufferedImage img) {
		img = image;
		float data[] = { 0.0625f, 0.125f, 0.0625f, 0.125f, 0.25f, 0.125f, 0.0625f, 0.125f, 0.0625f };
		Kernel kernel = new Kernel(3, 3, data);
		ConvolveOp convolve = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP, null);
		convolve.filter(img, image2);
		return image2;
	}


	public BufferedImage greyImage(BufferedImage img) {
		img = image;
		ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
		ColorConvertOp op = new ColorConvertOp(cs, null);
		img = op.filter(img, null);
		return img;
	}

	public BufferedImage scaleImage(BufferedImage img, int scalex, int scaley) {
		AffineTransform tx = new AffineTransform();
		tx.scale(scalex, scaley);
		AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
		img = op.filter(img, null);
		return img;
	}

	public BufferedImage Image(BufferedImage img, int scalex, int scaley) {
		AffineTransform tx = new AffineTransform();
		tx.scale(scalex, scaley);
		AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
		img = op.filter(img, null);
		return img;
	}

	public BufferedImage loadImage(String url) {
		ImageIcon icon = new ImageIcon(url);
		Image img = icon.getImage();
		
		BufferedImage buffImage = new BufferedImage(img.getWidth(null), img.getHeight(null),
				BufferedImage.TYPE_INT_ARGB);
	
		Graphics g = buffImage.getGraphics();
		g.drawImage(img, 0, 0, null);
		return buffImage;
	}


	public void displayImage(BufferedImage img) {
		Graphics2D gg = img.createGraphics();
		gg.drawImage(img, 0, 0, img.getWidth(null), img.getHeight(null), null);
		jLabel1.setIcon(new ImageIcon(img.getScaledInstance(-1, -1, BufferedImage.SCALE_DEFAULT)));
		repaint();
		image = img;
	}

	public BufferedImage flipVertical(BufferedImage img) {
		img = image;
		AffineTransform tx = AffineTransform.getScaleInstance(1, -1);
		tx.translate(0, -img.getHeight(null));
		AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
		img = op.filter(img, null);
		return img;
	}

	public BufferedImage flipHorizontal(BufferedImage img) {
		img = image;
		AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
		tx.translate(-img.getWidth(null), 0);
		AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
		img = op.filter(img, null);
		return img;
	}

	public BufferedImage flip180deg(BufferedImage img) {
		img = image;
		AffineTransform tx = AffineTransform.getScaleInstance(-1, -1);
		tx.translate(-img.getWidth(null), -img.getHeight(null));
		AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
		img = op.filter(img, null);
		return img;
	}

	public BufferedImage zoomin(BufferedImage img) {
		img = image;
		AffineTransform tx = AffineTransform.getScaleInstance(-2, 2);
		tx.translate(-img.getWidth(null), 0);
		AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
		img = op.filter(img, null);
		return img;
	}

	public int nextImageIndex(int i) {
		if (imageWorkQueue.length < HISTORY_SIZE) {
			currentImageIndex += i;
		} else if (currentImageIndex == HISTORY_SIZE - 1) {
			currentImageIndex = 0;
			isHistoryFull = true;
		} else {
			currentImageIndex += i;
			isHistoryFull = true;
		}
		return currentImageIndex;
	}

/*	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
			//	openingScene sc= new openingScene();
				
					new JavaImageProcessing().setVisible(true);
			}
		});*/
	//}
}
