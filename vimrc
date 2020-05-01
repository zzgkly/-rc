"基础设置
set nocompatible                " don't bother with vi compatibility "
set autoread                    " reload files when changed on disk, i.e. via `git checkout` "
set shortmess=atI

set magic                       " For regular expressions turn magic on "
set title                       " change the terminal's title "
set nobackup                    " do not keep a backup file "

set noerrorbells                " don't beep "
set visualbell t_vb=            " turn off error beep/flash "
set t_vb=
set timeoutlen=500
set mouse=a
set textwidth=80
set wrap
"编码设置
set encoding=utf-8
set fileencodings=ucs-bom,utf-8,cp936,gb18030,big5,euc-jp,euc-kr,latin1
set fileformats=unix,dos,mac
set termencoding=utf-8
set formatoptions+=m
set formatoptions+=B

"界面显示设置
set ruler                       " show the current row and column "
set number                      " show line numbers "
set nowrap
set showcmd                     " display incomplete commands "
set showmode                    " display current modes "
set showmatch                   " jump to matches when entering parentheses "
set matchtime=2                 " tenths of a second to show the matching parenthesis "

"搜索设置
set hlsearch                    " highlight searches "
set incsearch                   " do incremental searching, search as you type "
set ignorecase                  " ignore case when searching "
set smartcase                   " no ignorecase if Uppercase char present "

"制表符设置
set expandtab                   " expand tabs to spaces "
set smarttab
set shiftround

"缩进设置
set autoindent smartindent shiftround
set shiftwidth=4
set tabstop=4
set softtabstop=4                " insert mode tab and backspace use 4 spaces "

"光标设置
set cursorcolumn
set cursorline


"文件类型设置
filetype on
filetype plugin on
filetype indent on
filetype plugin indent on




call plug#begin('/usr/share/vim/vim82/plugged')
Plug 'vim-airline/vim-airline'
Plug 'luochen1990/rainbow'
Plug 'jiangmiao/auto-pairs'
Plug 'preservim/nerdcommenter'
Plug 'preservim/nerdtree'
Plug 'majutsushi/tagbar'
Plug 'vim-airline/vim-airline'
Plug 'vim-airline/vim-airline-themes'
Plug 'jayli/vim-easycomplete'
Plug 'kien/rainbow_parentheses.vim'
Plug 'nathanaelkane/vim-indent-guides'
Plug 'mhinz/vim-startify'
Plug 'neoclide/coc.nvim', {'branch': 'release'}
call plug#end()


nmap <F3> :TagbarToggle<CR>
map <F2> :NERDTreeToggle<CR>

let g:airline_powerline_fonts = 1  
let g:airline#extensions#tabline#enabled = 1
let g:rainbow_active = 1 "set to 0 if you want to enable it later via :RainbowToggle
let g:airline_theme='random'





"括号颜色
let g:rbpt_colorpairs = [
    \ ['brown',       'RoyalBlue3'],
    \ ['Darkblue',    'SeaGreen3'],
    \ ['darkgray',    'DarkOrchid3'],
    \ ['darkgreen',   'firebrick3'],
    \ ['darkcyan',    'RoyalBlue3'],
    \ ['darkred',     'SeaGreen3'],
    \ ['darkmagenta', 'DarkOrchid3'],
    \ ['brown',       'firebrick3'],
    \ ['gray',        'RoyalBlue3'],
    \ ['black',       'SeaGreen3'],
    \ ['darkmagenta', 'DarkOrchid3'],
    \ ['Darkblue',    'firebrick3'],
    \ ['darkgreen',   'RoyalBlue3'],
    \ ['darkcyan',    'SeaGreen3'],
    \ ['darkred',     'DarkOrchid3'],
    \ ['red',         'firebrick3'],
    \ ]
let g:rbpt_max = 16
let g:rbpt_loadcmd_toggle = 0
au VimEnter * RainbowParenthesesToggle
au Syntax * RainbowParenthesesLoadRound
au Syntax * RainbowParenthesesLoadSquare
au Syntax * RainbowParenthesesLoadBraces



map <F5> :!javac %&&java %:r <CR>
