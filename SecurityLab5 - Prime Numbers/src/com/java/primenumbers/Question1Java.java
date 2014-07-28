package com.java.primenumbers;
import java.math.BigInteger;
import java.util.Random;
import java.io.Console;
import java.math.*;
import java.security.SecureRandom;
import java.util.Random;

public class Question1Java 
{
	
	public static Random ran = new SecureRandom();
	
	public static blumblum blumBlum;
	public static AES aes;
	
	public static void main(String[] args)
	{
		
		blumBlum = new blumblum();
		aes = new AES();
		
		
		BigInteger BLUM = blumBlum.generateRondomNumber(); //creates a pseudorandom number with blum blum shub
		BigInteger aes_hold = aes.generateRondomNumber2(); //creates a psuedorandom number with AES
		BigInteger total;
		total = BLUM.add(aes_hold);  //total has BLUM and AES_hold added together
		
		//Question 1
		System.out.println("Question 1");
		System.out.println("blum blum shub: " + BLUM);
		System.out.println("AES: " + aes_hold);
		System.out.println("Total: " + total);
		System.out.println("  ");
		
		//Question 2
		System.out.println("Question 2");
		if(MillerRabin.PrimeTest(total))
		{
			System.out.println("the total number a prime number");
		}
		else
		{
			System.out.println("the total number is not a prime number");
		}
		System.out.println("  ");
		
		//Question 3 - make 10 large prime numbers
		System.out.println("Question 3");
		tenPrimes();
		System.out.println("  ");
		
		//Question 4 - Given a prime number, generate the next prime number;
		System.out.println("Question 4");
		nextPrime();
		System.out.println("  ");
		
		//Question 5 - check if public key is a prime
		System.out.println("Question 5");
		String mine = "10981697866707487106525666676567112865398497512068577910648766910599751171201161007747798510465847210881997410310710250113431211061167669861216768676574771097854975373697143719011699109771221137454695412185681206657505749551141045485103725372115501147211299102114537612010910611110487767677905543478310585535089691201031068011669120100558955668011857538011569851119949121431184311397114101669097112771031101118312069528583675375798968797983531141131057787551057910811155985087112491011069810611011910355113107691211075180711075354106751197411089811227711611998865352677847828712010710453437275106111861205711088102901011155750118431104883511141161165654978750994972108659871708686471021178055116102111120551157999571128912154788210067115103775611611910073102556648101103121721001018211282103105867111290113488111970858811999115103735767527710865666966656571487369781219787701107368120106991097011290121531118987531049810552537710766110988770112986753106985048431058169476666776665103651126681748386111438065104115106668110774901037165661191157467659968651036971708110367678111176666689676511969677210369677052656567103107811227710711170488553651069048971031024378103117120100981001225010410990434957103668389651041054755121691228211411411211611689113487068808481798575681164911275795710410855821081119786811018076698112012155109901116610298881181181191047878110776873487768881189779717370115102891191055353871089010912084111977355116867082100471098690811158611282101805612211611576821118752794910776871071106647871141149078981125110369106801141216999121114113109111114671077978975283657610353887311570101798872651211055165122907311880827551717610384118119110111987612111269118778752101691071164310366771197067801127882738612011552114861131187648561005053119110671084348898310290971187299109518510353658510071100799866857710373112786769771056510751538356122439910311886771205754495478111847697107103109107102791201135510083118103791071001081145050488111670117541008474891228866981076668818283861114380658110365112103113985010153109801088066102104667012290101120100118511201031041111107853986951701061076611311772991205489544767120116111103431017911048116117114786878828681525311451528911482108102577199102105701164971109111107109875012184531201086511812069105795011770121869776891031086812074111697083117757553110111118113114116971219047507757759865431005410148971008111053545412252110515175835011749108716512290715482116102841151189911190103104727510911875871217011483571216888984889827767791098710371121434710812076838165807397768668725590788610473106103120475067747347771146610550100871219883761084976110745685116515710384103116896874658954785057971227781811095682474872977610387848973771197750112109116785711577438752111117747471100103729098106826855868083102668811310651651028353112769847101115101981197110649878481658265816566105816910866661036665103658066817483861114380651041157766811077490103716565651117469771227475661007079817350761076973657566535310710175561177498122901124397117120108861161061197878122677510247884775477349667555751031211165411312086116120494969112691178475116103881118356981158752726850100665557108541085410074496598818798496676907784122716590101102115107861008248103106984912010610279120728187481181045569101516675559765491211025210248119491099011870886710597851175357867110689881058165795187108527482564998531169974477152108531198911311712111698121711031108310351861048180561061187175107565684971191048812111699807187548612210067120103755510283705354541001131201087466104109106974812211476867312273521131108777511068811582688110456116651007010675117818272113771088743767012210469120527298574810351741111201128880741035711910055568357771027111875575382738211075901098910072857383481071191127170481121161141131161046574475310080486161118103112122";
		pubKey_check(mine);
		
	}
	
	
	//Question 3
	//This function creates random numbers using the probablePrime command
	public static String tenPrimes()
	{
		System.out.println("A random prime number has been generated: ");
		
		for(int i = 0; i < 10; i++)
		{
			//this prints out a prime number 10 ten times. 
			//Proabable prime is not always accurate however, issues with large numbers arise
			System.out.println("Random number " + (i + 1) + " is: " + BigInteger.probablePrime(2000,ran));	
			
		}
		return null;
	}
	
	
	//Question 4
	//is the same as the last function but set to find only the following number
	public static String nextPrime()
	{
		
		BigInteger ran_start = BigInteger.probablePrime(300,ran); //create a large prime bigInt
		System.out.println(ran_start + ", the next prime is "); //print it
		
		System.out.println(ran_start.nextProbablePrime());
		
		return null;
	}
	
	//Question 5
	//check my public key for prime value
	public static String pubKey_check(String key)
	{
		
		BigInteger part1 = new BigInteger(key);
		
		System.out.println(part1);
		
		//isProbablePrime is inaccurate but in the absence 
		//of a more accurate function I have to use it 
		boolean prime = part1.isProbablePrime(1);
		System.out.print("Is it a prime number: ");
		System.out.println(prime);
		
		return null;
	}
	
	
}


