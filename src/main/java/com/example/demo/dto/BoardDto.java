package com.example.demo.dto;

import java.util.Date;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class BoardDto {
	private int board_id;
	private String board_title;
	private String board_contents;
	private String board_writer;
	private Date board_date;
}
