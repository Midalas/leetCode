package leetCode;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import unuseful.ImageHelper;

@SuppressWarnings("unused")
public class getImageParam {
	public static void main(String[] args) throws Exception {
		
		long startTime=System.currentTimeMillis();   //获取开始时间
		ArrayList<String> resultArray = produceFingerPrint("C:\\Users\\xsz16\\Desktop\\7x007.jpg");
		long endTime=System.currentTimeMillis(); //获取结束时间
		System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
	}

	public static ArrayList<String> produceFingerPrint(String path) throws IOException {
		DecimalFormat nf = new DecimalFormat("000");
		ArrayList<String> resultArray = new ArrayList<String>();
		BufferedImage thumb = ImageHelper.readPNGImage(path);
		int width = thumb.getWidth();// 默认缩小至8*8
		int height = thumb.getHeight();// 默认缩小至8*8
		int countx = 0;
		int county = 0;
		double simx=0.95;
		double simy=0.98;
		// BufferedImage thumb1 = ImageHelper.thumb(thumb, width, height,
		// false);

		int[][] pixels = new int[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				pixels[i][j] = ImageHelper.rgbToGray(thumb.getRGB(j, i));
			}
		}
		int avgPixel = ImageHelper.average(pixels, width, height);
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (pixels[i][j] > avgPixel) {
					pixels[i][j] = 1;
				} else {
					pixels[i][j] = 0;
				}

			}

		}

		int[] arrayx = new int[width];

		for (int x = 0; x < width; x++) {
			countx = 0;
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					if (j + x < width) {
						if (pixels[i][j] != pixels[i][j + x]) {
							countx++;
						}
					} else {
						if (pixels[i][j] != pixels[i][j + x - width]) {
							countx++;
						}
					}
				}
			}
			arrayx[x] = countx;

		}
		for (int i = 1; i < arrayx.length - 1; i++) {
			if ((arrayx[i] < arrayx[i - 1] * simx) && (arrayx[i] < arrayx[i + 1] * simx)
					|| arrayx[i - 1] == arrayx[i]) {
				System.out.print(i + " ");
			}

		}
		System.out.println("");
		int[] arrayy = new int[height];

		for (int y = 0; y < height; y++) {
			county = 0;
			for (int i = 0; i < width; i++) {
				for (int j = 0; j < height; j++) {
					if (j + y < height) {
						if (pixels[j + y][i] != pixels[j][i]) {
							county++;
						}
					} else {
						if (pixels[j + y - height][i] != pixels[j][i]) {
							county++;
						}
					}
				}
			}
			arrayy[y] = county;
			// System.out.println(county);
		}

		for (int i = 1; i < arrayy.length - 1; i++) {
			if ((arrayy[i] < arrayy[i - 1] * simy) && (arrayy[i] < arrayy[i + 1] * simy)
					|| arrayy[i - 1] == arrayy[i]) {
				System.out.print(i + " ");
			}
		}

		return resultArray;
	}

}
