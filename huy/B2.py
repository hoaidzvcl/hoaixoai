import pygame ,sys
pygame.init()
screen = pygame.display.set_mode((579,400))
pygame.display.set_caption('gamefootball')
clock = pygame.time.Clock()
bg = pygame.image.load('san.png').convert()
bird = pygame.image.load('ball.png').convert()
rect = bird.get_rect(center = (150,200))
game_font = pygame.font.Font('04B_19.ttf', 30)
score = 0
def sroce_show():
    score_display = game_font.render(str(score),True,(0,0,0))
    score_rect = score_display.get_rect(center = (30,20))
    screen.blit(score_display,score_rect)
def time_show():
    time_display = game_font.render(str(timee) + "s",True,(0,0,0))
    time_rect = time_display.get_rect(center = (530,20))
    screen.blit(time_display,time_rect)
sound = pygame.mixer.Sound('sound.wav')
while True:
    timee = 60 - (pygame.time.get_ticks() // 1000)
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
           pygame.quit()
           sys.exit()
        press = pygame.key.get_pressed()
        if press[pygame.K_w]:
            rect.top = rect.top - 1
            score += 1
            sound.play()
        if press[pygame.K_s]:
            rect.bottom = rect.bottom + 1
            score += 1
            sound.play()
        if press[pygame.K_a]:
            rect.left = rect.left - 1
            score += 1
            sound.play()
        if press[pygame.K_d]:
            rect.right = rect.right + 1
            score += 1
            sound.play()
                
        if rect.right > 449 :
            rect.right = 449
        if rect.left < 0 :
            rect.left = 0
        if rect.top < 0 :
            rect.top = 0
        if rect.bottom > 600:
            rect.bottom = 600
    if timee == 0:
        pygame.quit()
        sys.exit()
        
    screen.blit(bg,(0,0))
    screen.blit(bird,rect)
    sroce_show()
    time_show()
    pygame.display.update()
    clock.tick(120)
pygame.quit()