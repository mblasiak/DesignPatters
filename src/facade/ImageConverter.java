package facade;

class ImageConverter {
    void convertToPdf(String image){
        AdvanceImageEditor imageEditor=new AdvanceImageEditor();
        imageEditor.loadImage(image);
        imageEditor.exportImageAs(".pdf");
    }

    void convertToPng(String image) {
        AdvanceImageEditor imageEditor = new AdvanceImageEditor();
        imageEditor.loadImage(image);
        imageEditor.exportImageAs(".png");
    }

    }
