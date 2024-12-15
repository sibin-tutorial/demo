package com.example.demo;
// Candidate class representing each item in the "candidates" array
public class Candidate {
    private Content content;
    private String finishReason;
    private double avgLogprobs;

    @Override
	public String toString() {
		return "Candidate [content=" + content + ", finishReason=" + finishReason + ", avgLogprobs=" + avgLogprobs
				+ "]";
	}

	// Getters and Setters
    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public String getFinishReason() {
        return finishReason;
    }

    public void setFinishReason(String finishReason) {
        this.finishReason = finishReason;
    }

    public double getAvgLogprobs() {
        return avgLogprobs;
    }

    public void setAvgLogprobs(double avgLogprobs) {
        this.avgLogprobs = avgLogprobs;
    }
}