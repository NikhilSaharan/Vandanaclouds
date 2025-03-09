const images = [
    "download.jpg",
    "image.jpg",
    "picture.jpg",
    "photo.jpg"
];

let currentIndex = 0;

function showImage(index) {
    document.getElementById("sliderImage").src = images[index];
}

function prevImage() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    showImage(currentIndex);
}

function nextImage() {
    currentIndex = (currentIndex + 1) % images.length;
    showImage(currentIndex);
}

// Show the first image initially
showImage(currentIndex);
