package com.example.demo;
// UsageMetadata class representing the "usageMetadata" object
public class UsageMetadata {
    private int promptTokenCount;
    private int candidatesTokenCount;
    private int totalTokenCount;

    // Getters and Setters
    public int getPromptTokenCount() {
        return promptTokenCount;
    }

    @Override
	public String toString() {
		return "UsageMetadata [promptTokenCount=" + promptTokenCount + ", candidatesTokenCount=" + candidatesTokenCount
				+ ", totalTokenCount=" + totalTokenCount + "]";
	}

	public void setPromptTokenCount(int promptTokenCount) {
        this.promptTokenCount = promptTokenCount;
    }

    public int getCandidatesTokenCount() {
        return candidatesTokenCount;
    }

    public void setCandidatesTokenCount(int candidatesTokenCount) {
        this.candidatesTokenCount = candidatesTokenCount;
    }

    public int getTotalTokenCount() {
        return totalTokenCount;
    }

    public void setTotalTokenCount(int totalTokenCount) {
        this.totalTokenCount = totalTokenCount;
    }
}