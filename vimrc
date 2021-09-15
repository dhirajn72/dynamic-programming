
syntax on
set nu rnu
set tabstop=4 shiftwidth=4 expandtab 
""softtabstop=4 
set autoindent
set smartindent

"The following command scrolls the text so that (when possible) there are always at least 8 lines visible above the cursor, and 8 lines visible below the cursor
set scrolloff=8

" Maintains indentation on paste from Clipboard
"set paste
" Does not creates .swp file
" set noswapfile

" set nowrap
set incsearch " incremental search"
set ignorecase "ignore case while searching"
set hlsearch " highlight search"

" Searches deep down the directory
set path+=** " Search every directory from the currrent directory"

" Pops up the menu on tab
set wildmenu 
set wildmode=longest:full,full


inoremap " ""<left>
inoremap ' ''<left>
inoremap ( ()<left>
inoremap [ []<left>
inoremap { {}<left>
inoremap < <><left>
inoremap {<CR>  {<CR>}<ESC>O
inoremap {;<CR> {<CR>};<ESC>O

""noremap <Leader>\t :botright vertical terminal<CR>

" Allows to access/copy into  system clipboard, 
set clipboard=unnamed 
set splitright " Split to the right side of the window"
"colorscheme delek
""colorscheme default 
""set cursorline 

""highlight Normal ctermbg=white ctermfg=black
""highlight MatchParen cterm=none ctermbg=black  ctermfg=green

""Settig for side ba file explorer
""let g:netrw_banner = 0
""let g:netrw_liststyle = 3
""let g:netrw_browse_split = 4
""let g:netrw_altv = 1
""let g:netrw_winsize = 25
""augroup ProjectDrawer
""  autocmd!
""  autocmd VimEnter * :Vexplore
""augroup END

"Mode Settings

let &t_SI.="\e[5 q" "SI = INSERT mode
let &t_SR.="\e[1 q" "SR = REPLACE mode
let &t_EI.="\e[1 q" "EI = NORMAL mode (ELSE)

set ttimeout
set ttimeoutlen=1
set listchars=tab:>-,trail:~,extends:>,precedes:<,space:.
set ttyfast

"Cursor settings:

"  1 -> blinking block
"  2 -> solid block 
"  3 -> blinking underscore
"  4 -> solid underscore
"  5 -> blinking vertical bar
"  6 -> solid vertical bar
