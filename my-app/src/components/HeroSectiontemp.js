import React from 'react'
import './HeroSection.css'

export default function HeroSection() {
  return (
    <div>
      <h1>Welcome to TextFlow</h1>
      <p>
        Transform your text with ease. Convert to uppercase, summarize content, and get detailed analysis.
      </p>
      <div id="carouselExampleInterval" className="carousel slide" data-bs-ride="carousel">
        <div className="carousel-inner">
          <div className="carousel-item active" data-bs-interval="10000">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTVtnw8PnTOXCT3ehUx3SuOaJEkfxTPCDmvtpf7SrfYlA&s=10" className="d-block w-100 hero-image" alt="..." />
          </div>
          <div className="carousel-item" data-bs-interval="10000">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcSK1_TIFbqZOEi8IbVJbJ5H2reqf8LqpiotpP8PMTjA&s=10" className="d-block w-100 hero-image" alt="..." />
          </div>
          <div className="carousel-item" data-bs-interval="10000">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMuY9q4axJSPqcMfLfwyarkW-QOFRlaT7meu59edqgHA&s=10" className="d-block w-100 hero-image" alt="..." />
          </div>
        </div>
        <button className="carousel-control-prev" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="prev">
          <span className="carousel-control-prev-icon" aria-hidden="true"></span>
          <span className="visually-hidden">Previous</span>
        </button>
        <button className="carousel-control-next" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="next">
          <span className="carousel-control-next-icon" aria-hidden="true"></span>
          <span className="visually-hidden">Next</span>
        </button>
      </div>
    </div>
  )
}