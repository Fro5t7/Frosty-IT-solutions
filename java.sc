/* General Reset */
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

/* Body Styles */
body {
    font-family: Arial, sans-serif;
    background-color: #fff;
    color: #333;
}

/* Header Styles */
header {
    background-color: red;
    color: white;
    padding: 20px;
    text-align: center;
}

header h1 {
    font-size: 2.5em;
}

nav ul {
    list-style-type: none;
}

nav ul li {
    display: inline;
    margin-right: 20px;
}

nav ul li a {
    color: white;
    text-decoration: none;
    font-size: 1.2em;
}

/* Section Styles */
section {
    padding: 40px;
}

h2 {
    font-size: 2em;
    margin-bottom: 20px;
}

p {
    font-size: 1.2em;
    line-height: 1.6;
}

/* Gallery Styles */
.gallery {
    display: flex;
    gap: 15px;
    justify-content: center;
    flex-wrap: wrap;
}

.gallery img {
    width: 30%;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

/* Contact Form Styles */
form {
    display: flex;
    flex-direction: column;
    gap: 15px;
    max-width: 500px;
    margin: 0 auto;
}

form label {
    font-size: 1.1em;
}

form input, form textarea {
    padding: 10px;
    font-size: 1em;
    border: 1px solid #ccc;
    border-radius: 5px;
}

form button {
    padding: 10px 20px;
    background-color: blue;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}

form button:hover {
    background-color: darkblue;
}

/* Social Media Styles */
.social-media {
    text-align: center;
    margin-top: 30px;
}

.youtube-icon {
    width: 200px;
    border-radius: 10px;
    transition: 0.3s ease;
}

.youtube-icon:hover {
    transform: scale(1.1);
}

.youtube-icon + p {
    font-size: 1.2em;
    font-weight: bold;
}

/* Footer Styles */
footer {
    background-color: red;
    color: white;
    text-align: center;
    padding: 10px;
    margin-top: 50px;
}

/* Responsive Design */
@media screen and (max-width: 768px) {
    .gallery img {
        width: 45%;
    }
}

@media screen and (max-width: 480px) {
    .gallery img {
        width: 100%;
    }

    nav ul li {
        display: block;
        margin-right: 0;
    }

    header h1 {
        font-size: 1.8em;
    }

    nav ul {
        padding: 0;
    }

    nav ul li a {
        font-size: 1em;
    }

    section {
        padding: 20px;
    }
}
 