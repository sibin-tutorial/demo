package com.example.demo;
// Part class representing each item in the "parts" array
public class Part {
    private String text;

    // Getter and Setter
    public String getText() {
        return text;
    }

    @Override
	public String toString() {
		return "Part [text=" + text + "]";
	}

	public void setText(String text) {
        this.text = text;
    }
}