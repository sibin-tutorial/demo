package com.example.demo;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ContentRequest {

    @Override
	public String toString() {
		return "ContentRequest [contents=" + contents + "]";
	}

	private List<Content> contents;

    public static class Content {
        private List<Part> parts;

        public static class Part {
            private String text;

            public Part(String text) {
                this.text = text;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }

        public List<Part> getParts() {
            return parts;
        }

        public void setParts(List<Part> parts) {
            this.parts = parts;
        }
    }

    public List<Content> getContents() {
        return contents;
    }

    public void setContents(List<Content> contents) {
        this.contents = contents;
    }
}
