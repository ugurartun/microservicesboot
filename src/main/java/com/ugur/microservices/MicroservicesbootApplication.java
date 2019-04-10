package com.ugur.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MicroservicesbootApplication {

	@PostConstruct
	public void init() {
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesbootApplication.class, args);
		MicroservicesbootApplication.sendMessage("sdadadssd");

	}

	private static int MAX_MESSAGE_LENGTH = 160;
	private static char SPACE = ' ';

	public static List<String> sendMessage(String message)
	{
		List contentList = new ArrayList<String>();
		String content = message.trim();
		int length = content.trim().length();
		if(null != content)
		{
			if(length != 0 && content.length() <= MAX_MESSAGE_LENGTH)
			{
				contentList.add(content);
			}
			else
			{
				int mod = length % MAX_MESSAGE_LENGTH;
				for (int i=0; i<mod; i++)
				{
					int counterOuter = 1;
					if(content.charAt(MAX_MESSAGE_LENGTH) != SPACE)
					{
						contentList.add(content.substring(0, counterOuter * MAX_MESSAGE_LENGTH));
					}
					else
					{
						StringBuilder sb = new StringBuilder();
						String firstPart = content.substring(0, counterOuter * MAX_MESSAGE_LENGTH);
						for(i=0;i<MAX_MESSAGE_LENGTH;i++)
						{
							int counter = 1;
							int lengthOfFirstPart = firstPart.length();
							if(firstPart.charAt(length - 1) != SPACE)
							{
								sb.append(firstPart.substring(0, lengthOfFirstPart - counter)).append(SPACE).append("(").
										append((counter)).append("/").append(mod).append(")");
								contentList.add(sb.toString());
								break;
							}
							else
							{
								StringBuilder sb2 = new StringBuilder();
								if(firstPart.charAt(length - i) != SPACE)
								{
									contentList.add(sb2.append(firstPart.substring(0, length - i)));
									break;
								}
								continue;
							}

						}

					}
				}
			}
		}
		return contentList;
	}
}
