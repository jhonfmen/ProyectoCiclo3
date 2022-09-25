const video = document.querySelector('.video-container')
const playBtn = document.querySelector('.video-btn')
const navLinks = document.querySelectorAll('.nav-link')

playBtn.addEventListener("click", () => {
  playBtn.classList.toggle ("pause")

  playBtn.classList.contains("pause")
  ? video.pause()
  : video.play()
})

navLinks.forEach(link => {
  
  link.addEventListener("click", () => {
    navLinks.forEach(item => {
      item.classList.remove("active")
    })
    link.classList.add("active")
  })
})
